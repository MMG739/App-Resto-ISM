package com.backend.restaurant.data.fixtures;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.data.repositories.CategoryRepository;
import com.backend.restaurant.data.repositories.ProduitRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Random;

//@Component
@RequiredArgsConstructor
@Order(2)
public class ProduitsFIxtures implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    private  final ProduitRepository produitRepository;
    @Override
    public void run(String... args) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 1; i <=10 ; i++) {
            ProduitEntity obj= new ProduitEntity();
            obj.setLibelle(faker.food().sushi());
            obj.setDescription(faker.food().ingredient() + faker.food().ingredient() );
            obj.setPrixDeVente(random.nextDouble());
            Long randomLong = 2 + random.nextLong(8);
            Optional<CategoryEntity> category = categoryRepository.findById(randomLong);
            if (category != null) {
                obj.setCategory(category.get());
            }

            produitRepository.save(obj);

        }
    }
}
