package com.backend.restaurant.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "lignes_commandes")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LigneCommandeEntity extends  AbstractEntity{
    @ManyToOne
    private ProduitEntity produit;

    private Integer quantiteCommande;

    @ManyToOne
    private CommandeEntity commande;
}
