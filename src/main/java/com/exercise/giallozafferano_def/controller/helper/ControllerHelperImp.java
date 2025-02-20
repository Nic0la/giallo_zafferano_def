package com.exercise.giallozafferano_def.controller.helper;

import com.exercise.giallozafferano_def.model.dto.IngredientDto;
import com.exercise.giallozafferano_def.model.dto.RecipeDto;
import com.exercise.giallozafferano_def.model.entity.Ingredient;
import com.exercise.giallozafferano_def.model.entity.Recipe;
import com.exercise.giallozafferano_def.model.mapper.IngredientMapper;
import com.exercise.giallozafferano_def.model.mapper.RecipeMapper;
import com.exercise.giallozafferano_def.model.repository.IngredientRepository;
import com.exercise.giallozafferano_def.model.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ControllerHelperImp implements ControllerHelper {

    @Autowired
    RecipeMapper recipeMapper;

    @Autowired
    IngredientMapper ingredientMapper;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;


    @Override
    public List<RecipeDto> getAllRecipes() {
        List<Recipe> all = recipeRepository.findAll();
        List<RecipeDto> dtos = new ArrayList<>();
        for (Recipe recipe : all) {
            dtos.add(recipeMapper.toRecipeDto(recipe));
        }
        return dtos;
    }

    @Override
    public List<IngredientDto> getAllIngredient() {
        List<Ingredient> all = ingredientRepository.findAll();
        List<IngredientDto> dtos = new ArrayList<>();
        for (Ingredient ingredient : all) {
            dtos.add(ingredientMapper.toIngredientDto(ingredient));
        }
        return dtos;
    }

    @Override
    public IngredientDto getIngredientById(Long id) {
        Optional<Ingredient> batch = ingredientRepository.findById(id);
        if(batch.isPresent())
            return ingredientMapper.toIngredientDto(batch.get());
        return null;
    }

    @Override
    public IngredientDto getIngredientByName(String name) {
        try{
            Ingredient batch =ingredientRepository.findByName(name);
            return ingredientMapper.toIngredientDto(batch);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public IngredientDto saveIngredient(IngredientDto ingredientDto) {
        return null;
    }

    @Override
    public RecipeDto getRecipeById(Long id) {
        return null;
    }

    @Override
    public RecipeDto getRecipeByName(String name) {
        return null;
    }

    @Override
    public RecipeDto saveRecipe(RecipeDto recipeDto) {
        return null;
    }
}
