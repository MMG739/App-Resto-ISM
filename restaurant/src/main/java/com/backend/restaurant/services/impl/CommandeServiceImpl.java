package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.services.ICoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommandeServiceImpl implements ICoreService<CommandeEntity> {
    @Override
    public Page<CommandeEntity> findAllWithPagination() {
        return null;
    }

    @Override
    public CommandeEntity findById(Long id) {
        return null;
    }
}
