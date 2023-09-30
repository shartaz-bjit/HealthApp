package com.healthapp.userservice.service;

import com.healthapp.userservice.model.ContactRequestDto;
import com.healthapp.userservice.model.ContactResponseDto;
import com.healthapp.userservice.model.ContactUpdateDto;

import java.util.UUID;

public interface ContactService {
    void addContact(ContactRequestDto contactRequestDto);
    void updateContact(ContactUpdateDto contactUpdateDto, UUID userId);
    ContactResponseDto getContactById(UUID userId);
}
