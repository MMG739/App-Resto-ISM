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
@Table(name = "commandes")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommandeEntity extends  AbstractEntity{
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateCommande;
    


    private Double montantTotal;

    @OneToMany(mappedBy = "commande")
    private List<LigneCommandeEntity> ligneCommandesList;
}
