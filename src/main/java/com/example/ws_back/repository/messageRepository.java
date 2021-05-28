package com.example.ws_back.repository;

import com.example.ws_back.Model.Message;

import org.springframework.data.repository.CrudRepository;

public interface messageRepository extends CrudRepository<Message, String> {
  
}
