package com.healthapp.communityservice.repositories;

import com.healthapp.communityservice.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
}
