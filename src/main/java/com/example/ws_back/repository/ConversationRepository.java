package com.example.ws_back.repository;

import java.util.List;
import java.util.Optional;

import com.example.ws_back.Model.Conversation;
import com.example.ws_back.Model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConversationRepository extends CrudRepository<Conversation, String> {

  @Query(value = "SELECT c.* FROM conversation c, conversation_participants cp, user u where u.pseudo = cp.participants_pseudo AND cp.conversation_id = c.id and :#{#user.pseudo} = cp.participants_pseudo;", nativeQuery=true)
  List<Conversation> findForParticipant(@Param("user") Optional<User> user);
}