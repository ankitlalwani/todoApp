package com.ua.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.todo.model.Users;
import com.ua.todo.repo.UsersRepository;

@Service
public class UsersService {
	@Autowired
	UsersRepository userRepository;
	
	public Users addUser(Users user){
		return 	userRepository.save(user);
	}
}
