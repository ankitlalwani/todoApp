package com.ua.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ua.todo.model.Category;
import com.ua.todo.model.Status;
import com.ua.todo.model.Task;
import com.ua.todo.model.Users;
import com.ua.todo.repo.CategoryRepository;
import com.ua.todo.repo.StatusRepository;
import com.ua.todo.repo.TaskRepository;
import com.ua.todo.repo.UsersRepository;

import jakarta.transaction.Transactional;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private StatusRepository statusRepository;
	
	public List<Task> getAllTasks(String userId) {
		return taskRepository.findAllByUsersUserEmail(userId);
	}
	
	public Task createTask(Task task) {
//		taskRepository.save(new Task(task.getTaskName(), task.getTaskDescription(), task.getTaskDueDate(), task.getCategory().getId(), task.getStatus().getId(),task.getUsers().getId()))
		return taskRepository.save(task);
	}
	public Category addCategory(Category category){
		return categoryRepository.save(category);
	}
	@Transactional
	public void updateTaskStatusByTaskId(long id, long status_id){
		taskRepository.updateTaskStatusbyId(id, status_id);
	}
	
	public Task getTaskById(long id){
		return taskRepository.getReferenceById(id);
	}

}

