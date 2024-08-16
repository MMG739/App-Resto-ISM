package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.LigneCommandeEntity;
import com.backend.restaurant.services.ICoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LigneCommandeServiceImpl implements ICoreService<LigneCommandeEntity> {
    @Override
    public Page<LigneCommandeEntity> findAllWithPagination() {
        return null;
    }

    @Override
    public LigneCommandeEntity findById(Long id) {
        return null;
    }
}
