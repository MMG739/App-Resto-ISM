package com.backend.restaurant.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "produits")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProduitEntity extends  AbstractEntity{

    private String libelle;

    private String description;

    private  Double prixDeVente;

    @ManyToOne
    private CategoryEntity category;

    @OneToMany(mappedBy = "produit")
    private List<LigneCommandeEntity> ligneCommandesList;
}
