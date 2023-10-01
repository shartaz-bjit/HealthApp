package com.healthapp.mentalhealthservice.service;

import com.healthapp.mentalhealthservice.dto.MoodLogDTO;
import com.healthapp.mentalhealthservice.entity.MoodLog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public abstract class MoodLogService {
    protected abstract MoodLog createMoodLog(MoodLogDTO moodLogDTO);
    abstract MoodLog updateMoodLog(UUID id, MoodLogDTO moodLogDTO);
    abstract MoodLog getMoodLogById(UUID id);
    abstract boolean deleteMoodLog(UUID id);
    abstract List<MoodLog> getAllMoodLogs();
}
