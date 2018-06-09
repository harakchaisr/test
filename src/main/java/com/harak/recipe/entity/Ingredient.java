package com.harak.recipe.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
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
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

}
