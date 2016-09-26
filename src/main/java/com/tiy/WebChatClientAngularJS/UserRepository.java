package com.tiy.WebChatClientAngularJS;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by RdDvls on 9/25/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}

