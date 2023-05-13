package com.ua.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.ua.todo.model.Category;
import com.ua.todo.model.Status;
import com.ua.todo.model.Task;
import com.ua.todo.model.Users;
import com.ua.todo.service.TaskService;
import com.ua.todo.service.UsersService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private UsersService usersService;
	
	@GetMapping
	public List<Task> getTasksByUserId(@RequestParam("userId") String userId) {
		return taskService.getAllTasks(userId);
	}
	
	@PostMapping("/task")
	public Task createTask(@RequestBody Task task) {
		return taskService.createTask(task);
	}
	
	@PostMapping("/user")
	public Users createUser(@RequestBody Users user){
		return usersService.addUser(user);
	}
	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category){
		return taskService.addCategory(category);
	}
	@PostMapping("/status")
	public Status addStatus(@RequestBody Status status){
		return taskService.addStatus(status);
	}
}


