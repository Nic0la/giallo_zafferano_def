package com.exercise.giallozafferano_def.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String name, description;

    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> ingredients = new ArrayList<>();
}
