package com.healthapp.nutritionservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "recipe_id")
    private UUID recipeId;

    @Column(name = "food_id")
    private UUID foodId;

    @Column(name = "cooking_process", columnDefinition = "TEXT")
    private String cookingProcess;

    @Column(name = "cooking_time_minutes")
    private int cookingTimeMinutes;

    @OneToOne
    @JoinColumn(name = "nutrition_id")
    private Nutrition nutrition;
}
