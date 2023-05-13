package com.ua.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ua.todo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
