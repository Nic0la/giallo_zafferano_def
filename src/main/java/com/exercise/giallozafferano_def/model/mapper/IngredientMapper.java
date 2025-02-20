package com.exercise.giallozafferano_def.model.mapper;

import com.exercise.giallozafferano_def.model.dto.IngredientDto;
import com.exercise.giallozafferano_def.model.entity.Ingredient;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface IngredientMapper {

    IngredientDto toIngredientDto(Ingredient ingredient);

    Ingredient toEntity(IngredientDto ingredientDto);
}
