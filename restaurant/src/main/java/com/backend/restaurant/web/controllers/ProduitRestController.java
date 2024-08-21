package com.backend.restaurant.web.controllers;

import com.backend.restaurant.web.dto.request.ProductCreateDtoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public interface ProduitRestController {
    @GetMapping("/v1/product/all")
    ResponseEntity<Map<Object,Object>>
    list( @RequestParam(defaultValue = "0") int page,
          @RequestParam(defaultValue = "5") int size);
    @GetMapping("/v1/product/{id}")
    ResponseEntity<Map<Object,Object>>
    show(@PathVariable(name = "id") Long id);


    // cette version permet à la creation de L'objet ProduitEntity
    // de recuperer le libelle dans le body(JSON) et verifie si ce libelle
    // existe dans la BD il affecte cette category existante
    // au new Produit en cours d'ajout
    @PostMapping("/v1/product/new")
    ResponseEntity<Map<Object, Object>> create
            (@Validated @RequestBody ProductCreateDtoRequest obj,
             BindingResult bindingResult);

}
