package com.backend.restaurant.web.controllers.impl;

import com.backend.restaurant.services.CommandeService;
import com.backend.restaurant.web.controllers.IUneCommandeRestController;
import com.backend.restaurant.web.dto.request.CommandeCreateDtoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class IUneCommandeRestControllerImpl implements IUneCommandeRestController {
    private CommandeService commandeService;
    @Override
    public ResponseEntity<Map<Object, Object>> list(int page, int size) {
        return null;
    }

    @Override
    public ResponseEntity<Map<Object, Object>> show(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Map<Object, Object>> create(CommandeCreateDtoRequest obj, BindingResult bindingResult) {
        return null;
    }
}
