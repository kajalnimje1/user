package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.user.entities.User;
import com.user.service.IUserService;


@RestController
public class UserController {

//CREATE OBJECT OF IUserService
	@Autowired
	private IUserService iuserService;
	
	
//GET ALL USERS
@GetMapping("/user")
public List<User> getUser(){
	return this.iuserService.getUser();	
}

//POST
@PostMapping("/user")
public User addUser(@RequestBody User user) {
	return this.iuserService.addUser(user);
	
}
	
	
}
