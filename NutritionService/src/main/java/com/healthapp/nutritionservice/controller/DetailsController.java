package com.healthapp.nutritionservice.controller;

import com.healthapp.nutritionservice.dto.FoodDetailsDTO;
import com.healthapp.nutritionservice.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nutrition")
public class DetailsController {

    @Autowired
    private DetailsService detailsService;

    @GetMapping("/details/{word}")
    public ResponseEntity<FoodDetailsDTO> getFoodDetailsByName(@PathVariable String word) {
        FoodDetailsDTO foodDetailsDTO = detailsService.getFoodDetailsByName(word);

        if (foodDetailsDTO != null) {
            return new ResponseEntity<>(foodDetailsDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}