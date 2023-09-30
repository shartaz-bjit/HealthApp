package com.healthapp.userservice.service;

import com.healthapp.userservice.model.ProfileRequestDto;
import com.healthapp.userservice.model.ProfileResponseDto;
import com.healthapp.userservice.model.ProfileUpdateDto;

public interface ProfileService {
    void addProfile(ProfileRequestDto profileRequestDto);
    void updateProfile(ProfileUpdateDto profileUpdateDto);
    void findById(ProfileResponseDto profileResponseDto);
}
