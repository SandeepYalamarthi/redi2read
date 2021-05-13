package com.redislabs.learn.redi2read.repositories;

import com.redislabs.learn.redi2read.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findFirstByEmail(String email);
}
