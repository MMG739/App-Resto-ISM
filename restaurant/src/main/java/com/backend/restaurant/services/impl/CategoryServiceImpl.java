package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.services.ICoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements ICoreService<CategoryEntity> {
    @Override
    public Page<CategoryEntity> findAllWithPagination() {
        return null;
    }

    @Override
    public CategoryEntity findById(Long id) {
        return null;
    }
}
