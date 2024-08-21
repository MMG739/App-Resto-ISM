package com.backend.restaurant.web.dto.request;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDtoRequest {
    private  Long id;

    private  String libelle;
    private String description;

    private  Double prixDeVente;
    private String libelleCategory;
    private CategoryEntity category;
    public ProduitEntity toEntity(){
        ProduitEntity newObject= ProduitEntity.builder()
                .libelle(libelle)
                .description(description)
                .prixDeVente(prixDeVente)
                .category( libelleCategory.isEmpty() ? null : category ) // peut etre nullable à la creation
                .build();
        return  newObject;
    }
}
