package com.healthapp.userservice.service;

import com.healthapp.userservice.domain.UserEntity;
import com.healthapp.userservice.model.UserDeleteDto;
import com.healthapp.userservice.model.UserRequestDto;
import com.healthapp.userservice.model.UserResponseDto;
import com.healthapp.userservice.model.UserUpdateDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void registerUser(UserRequestDto userRequestDto);
    void updateUser(UserUpdateDto userUpdateDto, UUID userId);
    void deleteUser(UserDeleteDto userDeleteDto);
    UserResponseDto getUserById(UUID userId);
    List<UserEntity> getAllUsers();
}
