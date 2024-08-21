package com.backend.restaurant.services;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.web.dto.request.CategoryCreateDtoRequest;
import org.springframework.data.domain.Page;

public interface CategoryService extends ICoreService<CategoryEntity>,EntityBuilderService<CategoryCreateDtoRequest>{

}
