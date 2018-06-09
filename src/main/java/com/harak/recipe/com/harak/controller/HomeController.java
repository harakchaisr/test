package com.harak.recipe.com.harak.controller;

import com.harak.recipe.entity.Category;
import com.harak.recipe.entity.UnitOfMeasure;
import com.harak.recipe.repository.CategoryRepository;
import com.harak.recipe.repository.UnitRepository;
import com.harak.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private RecipeService recipeService;

    @Autowired
    private UnitRepository unitRepository;


    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model ){
        model.addAttribute("recipes", recipeService.getRecopies() );

        return "index";
    }

}
