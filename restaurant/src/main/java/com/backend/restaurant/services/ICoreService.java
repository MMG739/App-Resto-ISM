package com.backend.restaurant.services;

import org.springframework.data.domain.Page;

public interface ICoreService <T>{
    Page <T> findAllWithPagination(int page, int size);
    T findById(Long id);
//    T store(T dtoRequest);
}
