package com.ua.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
import com.ua.todo.service.StatusService;
import com.ua.todo.service.TaskService;
import com.ua.todo.service.UsersService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private StatusService statusService;
	
	@GetMapping
	public List<Task> getTasksByUserEmail(@RequestParam("userEmail") String userEmail) {
		return taskService.getAllTasks(userEmail);
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
	
	@PutMapping("/task/status")
	public Task updateTaskStatus(@RequestParam("id") long id, @RequestParam("statusName") String statusName){
		Status status = statusService.getStatusbyName(statusName);
		 taskService.updateTaskStatusByTaskId(id, status.getId());
		 return taskService.getTaskById(id);
	}
	@GetMapping("/task")
	public Task getTaskById(@RequestParam("id") Long id){
		return taskService.getTaskById(id);
	}
}


