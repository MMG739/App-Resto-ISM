package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.services.CommandeService;
import com.backend.restaurant.services.ICoreService;
import com.backend.restaurant.web.dto.request.CommandeCreateDtoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommandeServiceImpl implements CommandeService {
    @Override
    public Page<CommandeEntity> findAllWithPagination(int page, int size) {
        return null;
    }

    @Override
    public CommandeEntity findById(Long id) {
        return null;
    }

    @Override
    public void store(CommandeCreateDtoRequest dto) {

    }


}
