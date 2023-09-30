package com.healthapp.userservice.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequestDto {
    private String userId;
    private String gender;
    private Date dateOfBirth;
    private String bloodGroup;
    private boolean vegetarian;
    private int goalWeight;
    private int targetPeriod;
}
