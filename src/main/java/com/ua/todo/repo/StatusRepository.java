package com.ua.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ua.todo.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
}
