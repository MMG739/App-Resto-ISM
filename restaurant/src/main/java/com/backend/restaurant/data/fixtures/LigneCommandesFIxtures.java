package com.backend.restaurant.data.fixtures;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.entities.LigneCommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.data.repositories.CategoryRepository;
import com.backend.restaurant.data.repositories.CommandeRepository;
import com.backend.restaurant.data.repositories.LigneCommandeRepository;
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
@Order(4)
public class LigneCommandesFIxtures implements CommandLineRunner {
    private final ProduitRepository produitRepository;
    private  final CommandeRepository commandeRepository;
    private  final LigneCommandeRepository ligneCommandeRepository;
    @Override
    public void run(String... args) throws Exception {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 1; i <=10 ; i++) {
            LigneCommandeEntity obj= new LigneCommandeEntity();
            obj.setQuantiteCommande(random.nextInt());
            Long randomLong = 2 + random.nextLong(8);
            Optional<CommandeEntity> category = commandeRepository.findById(randomLong);
            Optional<ProduitEntity> produit = produitRepository.findById(randomLong);
            if (category != null && produit != null) {
                obj.setCommande(category.get());
                obj.setProduit(produit.get());
            }
            ligneCommandeRepository.save(obj);

        }
    }
}
