package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.services.ICoreService;
import com.backend.restaurant.services.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProduitServiceImpl implements ICoreService<ProduitEntity> {
    @Override
    public Page<ProduitEntity> findAllWithPagination() {
        return null;
    }

    @Override
    public ProduitEntity findById(Long id) {
        return null;
    }
}
