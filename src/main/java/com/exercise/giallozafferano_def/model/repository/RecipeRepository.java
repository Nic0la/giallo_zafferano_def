package com.exercise.giallozafferano_def.model.repository;

import com.exercise.giallozafferano_def.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
