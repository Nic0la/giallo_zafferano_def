package com.exercise.giallozafferano_def.model.entity;

import jakarta.persistence.*;

@Entity
public class RecipeIngredient {

    @EmbeddedId
    RecipeIngredientKey id;

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "recipe_id")
    Recipe recipe;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id")
    Ingredient ingredient;
}
