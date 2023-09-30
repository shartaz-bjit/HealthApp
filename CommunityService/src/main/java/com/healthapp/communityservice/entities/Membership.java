package com.healthapp.communityservice.entities;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID membershipId;
    private String role;
    private UUID userId;

    @ManyToOne
    @JoinColumn(name = "community_id")
    private Group community;
}
