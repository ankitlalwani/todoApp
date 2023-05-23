package com.ua.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ua.todo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findAllByUsersUserEmail(String userId);
	
	@Modifying
	@Query(value="update task set status_id = :status_id where id = :id", nativeQuery = true)
	void updateTaskStatusbyId(@Param("id") long id, @Param("status_id") long status_id);
}

