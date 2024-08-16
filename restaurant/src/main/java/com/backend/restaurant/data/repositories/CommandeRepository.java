package com.backend.restaurant.data.repositories;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.CommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<CommandeEntity,Long> {
}
