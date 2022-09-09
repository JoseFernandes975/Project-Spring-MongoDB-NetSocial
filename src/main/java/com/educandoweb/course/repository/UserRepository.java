package com.educandoweb.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
