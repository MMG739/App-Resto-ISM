package com.backend.restaurant.web.dto.request;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.entities.LigneCommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeCreateDtoRequest {
    private  Long id;
    private LocalDate dateCommande;
    private Double montantTotal;
    private List<LigneCommandeEntity> ligneCommandesList;
    public CommandeEntity toEntity(){
        CommandeEntity newObject= CommandeEntity.builder()
                .dateCommande(LocalDate.now())
                .montantTotal(montantTotal)
                .build();
        return  newObject;
    }
}
