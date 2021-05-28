package com.example.ws_back.Model;

public class HelloMessage {
  private User user;

  public HelloMessage() {
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public HelloMessage(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "HelloMessage [user=" + user + "]";
  }

}
