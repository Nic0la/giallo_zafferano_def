package com.exercise.giallozafferano_def.model.repository;

import com.exercise.giallozafferano_def.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    Ingredient findByName(String name);
}
