package com.exercise.giallozafferano_def.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class RecipeIngredient {

    @EmbeddedId
    RecipeIngredientKey id;

    @ManyToOne
    @JsonIgnore
    @MapsId("recipeId")
    @JoinColumn(name = "recipe_id")
    Recipe recipe;

    @ManyToOne
    @JsonIgnore
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id")
    Ingredient ingredient;
}
