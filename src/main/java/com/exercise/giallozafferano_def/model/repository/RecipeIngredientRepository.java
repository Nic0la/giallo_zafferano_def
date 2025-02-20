package com.exercise.giallozafferano_def.model.repository;

import com.exercise.giallozafferano_def.model.entity.RecipeIngredient;
import com.exercise.giallozafferano_def.model.entity.RecipeIngredientKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, RecipeIngredientKey> {
}
