package com.harak.recipe.service;

import com.harak.recipe.entity.Recipe;
import com.harak.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements  RecipeService{
@Autowired
    private RecipeRepository  recipeRepository;
@Override
public Set<Recipe> getRecopies(){
    Set<Recipe> recipeSet= new HashSet<>();
    recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

    return recipeSet;

}


}
