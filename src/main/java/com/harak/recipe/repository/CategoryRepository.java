package com.harak.recipe.repository;

import com.harak.recipe.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long>{


    Optional<Category> findByDescription(String description);
}
