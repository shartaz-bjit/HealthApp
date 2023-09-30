package com.healthapp.userservice.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactRequestDto {
    private String userId;
    private String primaryPhoneNumber;
    private String optionalPhoneNumber;
    private String country;
    private String city;
}
