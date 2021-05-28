package com.example.ws_back.Controller;

import java.util.UUID;

import com.example.ws_back.Model.Message;
import com.example.ws_back.repository.messageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @Autowired
  messageRepository mRepository;

  @MessageMapping("/sendMessage/{id}")
  @SendTo("/chat/{id}")
  public Message send(Message message) throws Exception {
    message.setId(UUID.randomUUID().toString());
    // mRepository.save(message);
    return message;
  }
}
