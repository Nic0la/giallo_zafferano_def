package com.exercise.giallozafferano_def.controller.helper;

import com.exercise.giallozafferano_def.model.dto.IngredientDto;
import com.exercise.giallozafferano_def.model.dto.RecipeDto;

import java.util.List;

public interface ControllerHelper {

    //List
    List<RecipeDto> getAllRecipes();
    List<IngredientDto> getAllIngredient();

    //Ingredient-get
    IngredientDto getIngredientById(Long id);
    IngredientDto getIngredientByName(String name);

    //Ingredient-save
    IngredientDto saveIngredient(IngredientDto ingredientDto);

    //Recipe-get
    RecipeDto getRecipeById(Long id);
    RecipeDto getRecipeByName(String name);

    //Recipe-save
    RecipeDto saveRecipe(RecipeDto recipeDto);


}
