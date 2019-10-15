package com.heroku.herokuapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroku.herokuapp.model.Users;
import com.heroku.herokuapp.repository.IUserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	IUserRepository userRepository;

	@GetMapping("/users")
	List<Users> getAllUsers() {
		return userRepository.findAll();
	}

}
