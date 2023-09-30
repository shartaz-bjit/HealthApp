package com.healthapp.mentalhealthservice.controller;


import com.healthapp.mentalhealthservice.dto.MentalHealthExerciseDTO;
import com.healthapp.mentalhealthservice.entity.MentalHealthExercise;
import com.healthapp.mentalhealthservice.service.MentalHealthExerciseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mental-health/exercises")
public class MentalHealthExerciseController {

    @Autowired
    private MentalHealthExerciseServiceImpl exerciseServiceImp;

    @PostMapping("/create")
    public ResponseEntity<MentalHealthExercise> createMentalHealthExercise(@RequestBody MentalHealthExerciseDTO exerciseDTO) {
        MentalHealthExercise createdExercise = exerciseServiceImp.createMentalHealthExercise(exerciseDTO);
        return new ResponseEntity<>(createdExercise, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<MentalHealthExercise>> getAllMentalHealthExercises() {
        List<MentalHealthExercise> exercises = exerciseServiceImp.getAllMentalHealthExercises();
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MentalHealthExercise> getMentalHealthExerciseById(@PathVariable Long id) {
        MentalHealthExercise exercise = exerciseServiceImp.getMentalHealthExerciseById(id);
        if (exercise != null) {
            return new ResponseEntity<>(exercise, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<MentalHealthExercise> updateMentalHealthExercise(@PathVariable Long id, @RequestBody MentalHealthExerciseDTO exerciseDTO) {
        MentalHealthExercise updatedExercise = exerciseServiceImp.updateMentalHealthExercise(id, exerciseDTO);
        if (updatedExercise != null) {
            return new ResponseEntity<>(updatedExercise, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMentalHealthExercise(@PathVariable Long id) {
        boolean deleted = exerciseServiceImp.deleteMentalHealthExercise(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

