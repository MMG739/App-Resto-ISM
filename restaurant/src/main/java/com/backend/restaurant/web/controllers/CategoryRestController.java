package com.backend.restaurant.web.controllers;

import com.backend.restaurant.web.dto.request.CategoryCreateDtoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface CategoryRestController {
    @GetMapping("/v1/category/all")
    ResponseEntity<Map<Object,Object>>
    list( @RequestParam(defaultValue = "0") int page,
          @RequestParam(defaultValue = "5") int size);

    @PostMapping("/v1/category/new")
    ResponseEntity<Map<Object, Object>> create
            (@Validated @RequestBody CategoryCreateDtoRequest obj,
             BindingResult bindingResult);
}
