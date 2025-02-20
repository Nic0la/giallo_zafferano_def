package com.exercise.giallozafferano_def.model.dto;

import com.exercise.giallozafferano_def.model.entity.RecipeIngredient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class IngredientDto {

    private Long id;
    private String name;
    private List<RecipeIngredient> recipeIngredients = new ArrayList<>();
}
