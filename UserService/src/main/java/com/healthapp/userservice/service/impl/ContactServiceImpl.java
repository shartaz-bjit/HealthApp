package com.healthapp.userservice.service.impl;

import com.healthapp.userservice.domain.Contact;
import com.healthapp.userservice.model.ContactRequestDto;
import com.healthapp.userservice.model.ContactResponseDto;
import com.healthapp.userservice.model.ContactUpdateDto;
import com.healthapp.userservice.repository.ContactRepository;
import com.healthapp.userservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public void addContact(ContactRequestDto contactRequestDto) {
        Contact contact=new Contact();
        contact.setUserId(contactRequestDto.getUserId());
        contact.setPrimaryPhoneNumber(contactRequestDto.getPrimaryPhoneNumber());
        contact.setOptionalPhoneNumber(contactRequestDto.getOptionalPhoneNumber());
        contact.setCountry(contactRequestDto.getCountry());
        contact.setCity(contactRequestDto.getCity());
        contactRepository.save(contact);
    }

    @Override
    public void updateContact(ContactUpdateDto contactUpdateDto, UUID userId) {
        contactRepository.findByUserId(userId).ifPresent(contact -> {
            if (contactUpdateDto.getPrimaryPhoneNumber() != null) {
                contact.setPrimaryPhoneNumber(contactUpdateDto.getPrimaryPhoneNumber());
            }
            if (contactUpdateDto.getOptionalPhoneNumber() != null) {
                contact.setOptionalPhoneNumber(contactUpdateDto.getOptionalPhoneNumber());
            }
            if (contactUpdateDto.getCountry() != null) {
                contact.setCountry(contactUpdateDto.getCountry());
            }
            if (contactUpdateDto.getCity() != null) {
                contact.setCity(contactUpdateDto.getCity());
            }
            contactRepository.save(contact);
        });
    }


    @Override
    public ContactResponseDto getContactById(UUID userId) {

    }
}
