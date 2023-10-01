package com.healthapp.nutritionservice.controller;

import com.healthapp.nutritionservice.entity.Nutrition;
import com.healthapp.nutritionservice.service.FoodService;
import com.healthapp.nutritionservice.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    
}