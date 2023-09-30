package com.healthapp.mentalhealthservice.repository;

import com.healthapp.mentalhealthservice.entity.MoodLog;
import org.springframework.data.jpa.repository.JpaRepository;

// MoodLogRepository.java
public interface MoodLogRepository extends JpaRepository<MoodLog, Long> {
}
