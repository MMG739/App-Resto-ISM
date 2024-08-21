package com.backend.restaurant.web.dto.request;

import com.backend.restaurant.data.entities.CommandeEntity;
import com.backend.restaurant.data.entities.LigneCommandeEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import jakarta.persistence.ManyToOne;
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
public class LigneDeCommandeCreateDtoRequest {
    private  Long id;
    private ProduitEntity produit;
    private Integer quantiteCommande;
    private CommandeEntity commande;
    public LigneCommandeEntity toEntity(){
        LigneCommandeEntity newObject= LigneCommandeEntity.builder()
                .quantiteCommande(quantiteCommande)
                .commande(commande)
                .produit(produit)
                .build();
        return  newObject;
    }
}
