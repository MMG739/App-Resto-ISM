package com.backend.restaurant.services;

import org.springframework.data.domain.Page;

public interface EntityBuilderService<T>{
    void store(T dto);
}
