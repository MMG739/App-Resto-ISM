package com.backend.restaurant.services.impl;

import com.backend.restaurant.data.entities.CategoryEntity;
import com.backend.restaurant.data.entities.ProduitEntity;
import com.backend.restaurant.data.repositories.CategoryRepository;
import com.backend.restaurant.data.repositories.ProduitRepository;
import com.backend.restaurant.exceptions.InternalServerErrorException;
import com.backend.restaurant.services.ProduitService;
import com.backend.restaurant.web.dto.request.ProductCreateDtoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProduitServiceImpl implements ProduitService {
private final ProduitRepository produitRepository;
private final CategoryRepository categoryRepository;
    @Override
    public Page<ProduitEntity> findAllWithPagination(int page, int size) {
        return produitRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public ProduitEntity findById(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public void store(ProductCreateDtoRequest dto) {
        ProduitEntity entity= dto.toEntity();
        entity.setLibelle(dto.getLibelle());
        entity.setId(dto.getId());
        entity.setDescription(dto.getDescription());
        entity.setPrixDeVente(dto.getPrixDeVente());
        if (dto.getLibelleCategory() != null){
            //rechercher la cat pour affecter
            String libelle=dto.getLibelleCategory();
            Optional<CategoryEntity> categoryByLibelle = categoryRepository.findByLibelle(libelle);
            if (categoryByLibelle == null) {
               throw  new InternalServerErrorException("Category Introuvable.");
            }
            entity.setCategory( categoryByLibelle.get() );
        }
        produitRepository.save(entity);
    }


}
