package com.backend.restaurant.services;

import org.springframework.data.domain.Page;

public interface ICoreService <T>{
    Page <T> findAllWithPagination();
    T findById(Long id);
}
