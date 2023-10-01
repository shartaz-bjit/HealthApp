package com.healthapp.mentalhealthservice.service;

import com.healthapp.mentalhealthservice.dto.MentalHealthExerciseDTO;
import com.healthapp.mentalhealthservice.entity.MentalHealthExercise;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public abstract class MentalHealthExerciseService {
    abstract MentalHealthExercise createMentalHealthExercise(MentalHealthExerciseDTO exerciseDTO);
    abstract MentalHealthExercise updateMentalHealthExercise(UUID id, MentalHealthExerciseDTO exerciseDTO);
    abstract MentalHealthExercise getMentalHealthExerciseById(UUID id);
    abstract boolean  deleteMentalHealthExercise(UUID id);
    abstract List<MentalHealthExercise> getAllMentalHealthExercises();
}
