package com.exercise.giallozafferano_def.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecipeIngredientKey implements Serializable {

    @Column(name="ingredient_id")
    Long ingredientId;

    @Column(name="recipe_id")
    Long recipeId;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RecipeIngredientKey that)) return false;
        return Objects.equals(ingredientId, that.ingredientId) && Objects.equals(recipeId, that.recipeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientId, recipeId);
    }
}
