package com.example.ws_back.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "conversation")
public class Conversation {
  @Id
  private String id;
  
  @ManyToMany
  // @JoinTable(name = "conversation_participant", joinColumns = @JoinColumn(name="conversation_id"), inverseJoinColumns = @JoinColumn(name="participant_pseudo"))
  private List<User> participants;

  public List<User> getParticipants() {
    return participants;
  }

  public void setParticipants(List<User> participants) {
    this.participants = participants;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Conversation() {
  }

  public Conversation(String id, List<User> participants) {
    this.id = id;
    this.participants = participants;
  }

}
