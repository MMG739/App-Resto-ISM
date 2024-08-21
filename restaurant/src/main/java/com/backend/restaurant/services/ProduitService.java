package com.backend.restaurant.services;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.web.dto.request.CategoryCreateDtoRequest;
import com.backend.restaurant.web.dto.request.ProductCreateDtoRequest;

public interface ProduitService extends ICoreService<ProduitEntity>,EntityBuilderService<ProductCreateDtoRequest>{

}
