package com.example.ws_back.repository;

import com.example.ws_back.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, String> {
  
}