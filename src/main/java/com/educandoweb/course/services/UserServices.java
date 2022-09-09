package com.educandoweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.educandoweb.course.domain.User;
import com.educandoweb.course.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
}
