package com.tiy.WebChatClientAngularJS;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by RdDvls on 9/25/16.
 */
public interface MessageRepository extends CrudRepository<Message, Integer> {
    public Iterable<Message> findByName(String username);
}