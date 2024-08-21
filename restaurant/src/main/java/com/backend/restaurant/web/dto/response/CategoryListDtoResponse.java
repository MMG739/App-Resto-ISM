package com.backend.restaurant.web.dto.response;

import com.backend.restaurant.data.entities.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryListDtoResponse {
    private Long id;
    private String libelle;
    public static CategoryListDtoResponse toDto(CategoryEntity obj){

        return  CategoryListDtoResponse.builder()
                .id(obj.getId())
                .libelle(obj.getLibelle())
                .build();
    }
}
