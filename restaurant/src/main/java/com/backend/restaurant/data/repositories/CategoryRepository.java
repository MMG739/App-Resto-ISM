package com.backend.restaurant.data.repositories;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.LigneCommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
    Optional<CategoryEntity> findByLibelle(String libelle);
}
