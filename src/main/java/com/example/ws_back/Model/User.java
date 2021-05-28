package com.example.ws_back.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
  @Id
  private String pseudo;

  @OneToOne(mappedBy = "sender")
  private Message message;

  public User(String pseudo) {
    this.pseudo = pseudo;
  }

  public User() {
  }

  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  @Override
  public String toString() {
    return "User [message=" + message + ", pseudo=" + pseudo + "]";
  }

}
