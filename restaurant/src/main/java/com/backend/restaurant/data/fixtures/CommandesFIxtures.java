package com.backend.restaurant.data.fixtures;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.repositories.CategoryRepository;
import com.backend.restaurant.data.repositories.CommandeRepository;
import com.backend.restaurant.data.repositories.ProduitRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

//@Component
@RequiredArgsConstructor
@Order(3)
public class CommandesFIxtures implements CommandLineRunner {
    private  final CommandeRepository commandeRepository;
    @Override
    public void run(String... args) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 1; i <=10 ; i++) {
            CommandeEntity obj= new CommandeEntity();
            obj.setDateCommande(LocalDate.now());
            obj.setMontantTotal(random.nextDouble());
            
            commandeRepository.save(obj);

        }
    }
}
