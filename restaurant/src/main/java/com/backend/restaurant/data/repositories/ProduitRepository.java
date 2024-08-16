package com.backend.restaurant.data.repositories;

import com.backend.restaurant.data.entities.LigneCommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,Long> {
}
