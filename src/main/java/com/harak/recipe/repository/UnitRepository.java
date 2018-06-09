package com.harak.recipe.repository;

import com.harak.recipe.entity.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitRepository extends CrudRepository<UnitOfMeasure, Long>{
    Optional<UnitOfMeasure> findByDescription(String description);
}
