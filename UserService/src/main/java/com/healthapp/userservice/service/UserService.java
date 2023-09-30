package com.healthapp.userservice.service;

import com.healthapp.userservice.model.UserDeleteDto;
import com.healthapp.userservice.model.UserRequestDto;
import com.healthapp.userservice.model.UserUpdateDto;

public interface UserService {
    void registerUser(UserRequestDto userRequestDto);
    void updateUser(UserUpdateDto userUpdateDto);
    void deleteUser(UserDeleteDto userDeleteDto);
}
