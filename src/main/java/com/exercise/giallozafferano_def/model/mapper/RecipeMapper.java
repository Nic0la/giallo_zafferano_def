package com.exercise.giallozafferano_def.model.mapper;


import com.exercise.giallozafferano_def.model.dto.RecipeDto;
import com.exercise.giallozafferano_def.model.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface RecipeMapper {

    RecipeDto toRecipeDto(Recipe recipe);

    Recipe toEntity(RecipeDto recipeDto);

}
