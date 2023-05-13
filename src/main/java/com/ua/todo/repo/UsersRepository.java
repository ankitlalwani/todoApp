package com.ua.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ua.todo.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
