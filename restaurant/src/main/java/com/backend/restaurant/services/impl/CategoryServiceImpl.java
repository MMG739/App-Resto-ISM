package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.repositories.CategoryRepository;
import com.backend.restaurant.services.CategoryService;
import com.backend.restaurant.services.ICoreService;
import com.backend.restaurant.web.dto.request.CategoryCreateDtoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
   private final CategoryRepository categoryRepository;
    @Override
    public Page<CategoryEntity> findAllWithPagination(int page, int size) {
        return categoryRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public CategoryEntity findById(Long id) {
        return null;
    }

    @Override
    public void store(CategoryCreateDtoRequest dto) {
        CategoryEntity entity= dto.toEntity();
        entity.setLibelle(dto.getLibelle());
        entity.setId(dto.getId());
         categoryRepository.save(entity);
    }
}
