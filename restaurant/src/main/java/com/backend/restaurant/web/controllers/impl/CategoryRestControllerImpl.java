package com.backend.restaurant.web.controllers.impl;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.services.CategoryService;
import com.backend.restaurant.services.ICoreService;
import com.backend.restaurant.web.controllers.CategoryRestController;
import com.backend.restaurant.web.dto.request.CategoryCreateDtoRequest;
import com.backend.restaurant.web.dto.response.CategoryListDtoResponse;
import com.backend.restaurant.web.dto.response.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryRestControllerImpl implements CategoryRestController {

    private final CategoryService categoryService;
    @Override
    public ResponseEntity<Map<Object, Object>> list(int page, int size) {
        Map<Object,Object> response = new HashMap<>();

        Page<CategoryEntity> categoryList = categoryService.findAllWithPagination(page, size);
        Page<CategoryListDtoResponse> map = categoryList.map(
                obj ->
                        CategoryListDtoResponse.toDto(obj)

        );
        response= RestResponse.paginateResponse(map.getContent(),
                new int[map.getTotalPages()], page, map.getTotalElements()
                , map.getTotalPages(),  HttpStatus.OK);

        return new ResponseEntity<>(response, HttpStatus.OK );
    }

    @Override
    public ResponseEntity<Map<Object, Object>> create(CategoryCreateDtoRequest obj, BindingResult bindingResult) {
        Map<Object, Object> response;
        if (bindingResult.hasErrors()){
            Map<String, String> errors =new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
            response= RestResponse.toSingleResponse(errors, HttpStatus.NOT_FOUND);
        }else{
            categoryService.store(obj);
            response= RestResponse.toSingleResponse(obj,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
