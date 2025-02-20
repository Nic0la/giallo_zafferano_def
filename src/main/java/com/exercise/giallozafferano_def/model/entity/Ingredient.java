package com.exercise.giallozafferano_def.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Data
public class Ingredient {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "ingredient")
    private List<RecipeIngredient> recipeIngredients = new ArrayList<>();
}
