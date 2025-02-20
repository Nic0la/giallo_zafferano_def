package com.exercise.giallozafferano_def.controller;

import com.exercise.giallozafferano_def.controller.helper.ControllerHelper;
import com.exercise.giallozafferano_def.model.dto.RecipeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    ControllerHelper ch;

    @GetMapping
    public List<RecipeDto> getAllRecipes() {
        return ch.getAllRecipes();
    }


}
