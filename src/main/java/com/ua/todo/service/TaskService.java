package com.ua.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ua.todo.model.Task;
import com.ua.todo.repo.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getAllTasks(String userId) {
		return taskRepository.findAllByUsersUserName(userId);
	}
}

