package com.example.ws_back.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
  @Id
  private String id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user", referencedColumnName = "pseudo")
  private User sender;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  private String time;
  private String body;

  public User getSender() {
    return sender;
  }

  public void setSender(User sender) {
    this.sender = sender;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Message() {
  }

  public Message(User sender, String time, String body) {
    this.sender = sender;
    this.time = time;
    this.body = body;
  }

  @Override
  public String toString() {
    return "Message [id=" + id + ", body=" + body + " sender=" + sender + ", time=" + time + "]";
  }

}
