package com.healthapp.communityservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/community/groups")
public class GroupController {
    @PostMapping
    ResponseEntity<String> create(){
        return null;
    }

    @GetMapping
    ResponseEntity<?> readById(){
        return null;
    }

    @PutMapping
    ResponseEntity<String> update(){
        return null;
    }

    @DeleteMapping
    ResponseEntity<String> delete(){
        return null;
    }

    @PostMapping("/add-member")
    ResponseEntity<String> addMember(){
        return null;
    }

    @DeleteMapping("/remove-member")
    ResponseEntity<String> removeMember(){
        return null;
    }
}
