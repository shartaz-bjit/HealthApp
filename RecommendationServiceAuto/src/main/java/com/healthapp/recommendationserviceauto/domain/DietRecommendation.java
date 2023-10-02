package com.healthapp.recommendationserviceauto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity @Setter @Getter @RequiredArgsConstructor
public class DietRecommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID dietRecommendationId;
    private double height;
    private double weight;
    private double goalWeight;
    private double periodInDays;
    private boolean allergenic;
    private boolean vegan;
    private String recommendationMessage;
    private LocalDateTime recommendationTime;
    private List<Insights> insights;
    private List<Meal> breakfast;
    private List<Meal> lunch;
    private List<Meal> dinner;
    private List<Meal> snacks;
}
