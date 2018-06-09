package com.harak.recipe.repository;

import com.harak.recipe.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
}
