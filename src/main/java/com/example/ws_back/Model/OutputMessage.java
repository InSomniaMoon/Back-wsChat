package com.example.ws_back.Model;

public class OutputMessage {
  private User sender;
  private String text;
  private String date;

  public User getSender() {
    return sender;
  }

  public void setSender(User sender) {
    this.sender = sender;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OutputMessage(User sender, String text, String date) {
    this.sender = sender;
    this.text = text;
    this.date = date;
  }

  public OutputMessage() {
  }

}
