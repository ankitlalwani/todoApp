package com.ua.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.ua.todo.model.Task;
import com.ua.todo.service.TaskService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public List<Task> getTasksByUserId(@RequestParam("userId") String userId) {
		return taskService.getAllTasks(userId);
	}
}


