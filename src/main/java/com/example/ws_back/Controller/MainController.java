package com.example.ws_back.Controller;

import java.util.UUID;

import com.example.ws_back.repository.ConversationRepository;
import com.example.ws_back.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  ConversationRepository cRepository;

  @Autowired
  UserRepository uRepository;

  @GetMapping(value = "/")
  public UUID helloString() {
    return UUID.randomUUID();
  }
}