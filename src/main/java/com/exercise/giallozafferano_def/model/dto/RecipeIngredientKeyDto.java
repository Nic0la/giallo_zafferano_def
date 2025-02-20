package com.exercise.giallozafferano_def.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class RecipeIngredientKeyDto {

    Long ingredientId;
    Long recipeId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredientKeyDto that = (RecipeIngredientKeyDto) o;
        return Objects.equals(ingredientId, that.ingredientId) && Objects.equals(recipeId, that.recipeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientId, recipeId);
    }
}
