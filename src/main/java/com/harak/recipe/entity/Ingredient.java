package com.harak.recipe.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
@Data

import javax.persistence.*;
import java.math.BigDecimal;

@Entity

public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;


    public Ingredient(){

    }

    public Ingredient(String ripe_avocados, BigDecimal bigDecimal, UnitOfMeasure eachUom) {
    }

    @OneToOne(fetch = FetchType.EAGER)

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }
@OneToOne(fetch = FetchType.EAGER)

    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
