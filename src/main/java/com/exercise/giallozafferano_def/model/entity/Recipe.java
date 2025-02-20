package com.exercise.giallozafferano_def.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String name, description;

    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> ingredients = new ArrayList<>();
}
