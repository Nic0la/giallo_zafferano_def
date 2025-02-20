package com.exercise.giallozafferano_def.model.mapper;

import com.exercise.giallozafferano_def.model.dto.RecipeIngredientDto;
import com.exercise.giallozafferano_def.model.entity.RecipeIngredient;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface RecipeIngredientMapper {

    RecipeIngredientDto toRecipeIngredientDto(RecipeIngredient recipeIngredient);

    RecipeIngredient toEntity(RecipeIngredientDto recipeIngredientDto);

}
