package com.backend.restaurant.web.controllers;

import com.backend.restaurant.web.dto.request.CommandeCreateDtoRequest;
import com.backend.restaurant.web.dto.request.ProductCreateDtoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public interface IUneCommandeRestController {
    @GetMapping("/v1/commandes/all")
    ResponseEntity<Map<Object,Object>>
    list( @RequestParam(defaultValue = "0") int page,
          @RequestParam(defaultValue = "5") int size);
    @GetMapping("/v1/commande/{id}")
    ResponseEntity<Map<Object,Object>>
    show(@PathVariable(name = "id") Long id);


    @PostMapping("/v1/commande/new")
    ResponseEntity<Map<Object, Object>> create
            (@Validated @RequestBody CommandeCreateDtoRequest obj,
             BindingResult bindingResult);

}
