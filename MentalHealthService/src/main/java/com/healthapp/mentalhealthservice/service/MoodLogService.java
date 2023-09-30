package com.healthapp.mentalhealthservice.service;

import com.healthapp.mentalhealthservice.dto.MoodLogDTO;
import com.healthapp.mentalhealthservice.entity.MoodLog;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public abstract class MoodLogService {
    protected abstract MoodLog createMoodLog(MoodLogDTO moodLogDTO);
    abstract MoodLog updateMoodLog(Long id, MoodLogDTO moodLogDTO);
    abstract MoodLog getMoodLogById(Long id);
    abstract boolean deleteMoodLog(Long id);
    abstract List<MoodLog> getAllMoodLogs();
}
