package com.backend.restaurant.data.fixtures;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.repositories.CategoryRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
@RequiredArgsConstructor
@Order(1)
public class CategoryFIxtures implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    @Override
    public void run(String... args) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 1; i <=10 ; i++) {
            CategoryEntity obj= new CategoryEntity();
            obj.setLibelle(faker.food().vegetable());
            categoryRepository.save(obj);

        }
    }
}
