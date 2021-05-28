package com.example.ws_back.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.ws_back.Model.Conversation;
import com.example.ws_back.Model.User;
import com.example.ws_back.repository.ConversationRepository;
import com.example.ws_back.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversations")
public class ConversationController {

  @Autowired
  ConversationRepository cRepository;
  @Autowired
  UserRepository uRepository;

  @GetMapping(value = "/all")
  public Iterable<Conversation> getMethodName() {
    return cRepository.findAll();
  }

  @GetMapping(value = "/for/{upseudo}")
  public List<Conversation> getMethodName(@PathVariable String upseudo) {
    return cRepository.findForParticipant(uRepository.findById(upseudo));
  }

  @PostMapping(value = "/init")
  public Boolean initConv() {
    List<Conversation> convs = new ArrayList<Conversation>();
    User pedro = uRepository.findById("Pedro").get();
    User jack = uRepository.findById("Jack").get();
    User marie = uRepository.findById("Marie").get();
    User antoine = uRepository.findById("Antoine").get();
    User caillou = uRepository.findById("Caillou").get();

    ArrayList<User> part = new ArrayList<User>();
    part.add(pedro);
    part.add(jack);
    convs.add(new Conversation(UUID.randomUUID().toString(), part));

    ArrayList<User> part2 = new ArrayList<User>();
    part2.add(pedro);
    part2.add(marie);
    convs.add(new Conversation(UUID.randomUUID().toString(), part2));

    ArrayList<User> part3 = new ArrayList<User>();
    part3.add(pedro);
    part3.add(antoine);
    convs.add(new Conversation(UUID.randomUUID().toString(), part3));

    ArrayList<User> part4 = new ArrayList<User>();
    part4.add(pedro);
    part4.add(caillou);
    convs.add(new Conversation(UUID.randomUUID().toString(), part4));

    cRepository.saveAll(convs);
    return true;
  }

}
