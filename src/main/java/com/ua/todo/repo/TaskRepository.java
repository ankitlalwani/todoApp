package com.ua.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ua.todo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findAllByUsersUserName(String userId);
}

