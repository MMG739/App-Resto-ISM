package com.backend.restaurant.services;

import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.web.dto.request.CommandeCreateDtoRequest;
import com.backend.restaurant.web.dto.request.ProductCreateDtoRequest;

public interface CommandeService extends ICoreService<CommandeEntity>,
        EntityBuilderService<CommandeCreateDtoRequest>{


}
