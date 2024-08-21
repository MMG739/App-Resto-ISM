package com.backend.restaurant.web.dto.request;

import com.backend.restaurant.data.entities.CategoryEntity;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryCreateDtoRequest {
    private  Long id;

    private  String libelle;
    public CategoryEntity toEntity(){
        CategoryEntity newObject= CategoryEntity.builder()
                .libelle(libelle)

                .build();
        return  newObject;
    }
}
