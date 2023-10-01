package com.healthapp.communityservice.repositories;

import com.healthapp.communityservice.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MembershipRepository extends JpaRepository<Membership, UUID> {
}
