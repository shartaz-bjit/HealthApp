package com.healthapp.mentalhealthservice.service;

import com.healthapp.mentalhealthservice.dto.MentalHealthExerciseDTO;
import com.healthapp.mentalhealthservice.entity.MentalHealthExercise;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public abstract class MentalHealthExerciseService {
    abstract MentalHealthExercise createMentalHealthExercise(MentalHealthExerciseDTO exerciseDTO);
    abstract MentalHealthExercise updateMentalHealthExercise(Long id, MentalHealthExerciseDTO exerciseDTO);
    abstract MentalHealthExercise getMentalHealthExerciseById(Long id);
    abstract boolean  deleteMentalHealthExercise(Long id);
    abstract List<MentalHealthExercise> getAllMentalHealthExercises();
}
