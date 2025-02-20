package com.exercise.giallozafferano_def.model.dto;

import com.exercise.giallozafferano_def.model.entity.RecipeIngredient;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class RecipeDto {

    private Long id;
    private String name, description;
    private List<RecipeIngredient> ingredients = new ArrayList<>();


}
