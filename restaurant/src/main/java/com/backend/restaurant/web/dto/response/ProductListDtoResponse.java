package com.backend.restaurant.web.dto.response;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductListDtoResponse {
    private Long id;
    private String libelle;
    private String description;

    private  Double prixDeVente;
    private String  nomDeLaCategory;
    public static ProductListDtoResponse toDto(ProduitEntity obj){

        return  ProductListDtoResponse.builder()
                .id(obj.getId())
                .libelle(obj.getLibelle())
                .description(obj.getDescription())
                .prixDeVente(obj.getPrixDeVente())
                .nomDeLaCategory(obj.getCategory().getLibelle())
                .build();
    }
}
