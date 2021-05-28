package com.example.ws_back.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.ws_back.Model.User;
import com.example.ws_back.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  UserRepository uRepository;

  @GetMapping(value="")
  public List<User> getUsers() {
      return uRepository.findAll();
  }
  

  @PostMapping(value = "/register")
  public User saveUser(@RequestBody User user) throws Exception {
    if (uRepository.existsById(user.getPseudo())) {
      throw new Exception("user exists");
    }
    return uRepository.save(user);
  }

  @PostMapping(value = "/connect")
  public User connectUser(@RequestBody User user) {
    return uRepository.findById(user.getPseudo()).orElseThrow();
  }

  @PostMapping(value = "/init")
  public Boolean initUsers() {
    List<User> user = new ArrayList<User>();
    user.add(new User("Pedro"));
    user.add(new User("Antoine"));
    user.add(new User("Marie"));
    user.add(new User("Caillou"));
    user.add(new User("Jack"));

    uRepository.saveAll(user);
    return true;
  }

}
