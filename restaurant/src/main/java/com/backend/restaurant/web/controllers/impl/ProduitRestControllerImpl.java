package com.backend.restaurant.web.controllers.impl;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.services.ProduitService;
import com.backend.restaurant.web.controllers.ProduitRestController;
import com.backend.restaurant.web.dto.request.ProductCreateDtoRequest;
import com.backend.restaurant.web.dto.response.CategoryListDtoResponse;
import com.backend.restaurant.web.dto.response.ProductListDtoResponse;
import com.backend.restaurant.web.dto.response.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProduitRestControllerImpl implements ProduitRestController {
    private final ProduitService produitService;
    @Override
    public ResponseEntity<Map<Object, Object>> list(int page, int size) {
        Map<Object,Object> response = new HashMap<>();

        Page<ProduitEntity> liste = produitService.findAllWithPagination(page, size);
        Page<ProductListDtoResponse> map = liste.map(
                obj -> ProductListDtoResponse.toDto(obj)

        );
        response= RestResponse.paginateResponse(map.getContent(),
                new int[map.getTotalPages()], page, map.getTotalElements()
                , map.getTotalPages(),  HttpStatus.OK);

        return new ResponseEntity<>(response, HttpStatus.OK );
    }

    @Override
    public ResponseEntity<Map<Object, Object>> show(Long id) {
        Map<Object,Object> response = new HashMap<>();
        ProduitEntity produit = produitService.findById(id);
        if (produit == null) {
            return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        response = RestResponse.toSingleResponse(ProductListDtoResponse.toDto(produit),
                HttpStatus.OK);
        return  new ResponseEntity<>(response, HttpStatus.OK );
    }

    @Override
    public ResponseEntity<Map<Object, Object>> create(ProductCreateDtoRequest obj, BindingResult bindingResult) {
        Map<Object, Object> response;
        if (bindingResult.hasErrors()){
            Map<String, String> errors =new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
            response= RestResponse.toSingleResponse(errors, HttpStatus.NOT_FOUND);
        }else{
            produitService.store(obj);
            response= RestResponse.toSingleResponse(obj,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
