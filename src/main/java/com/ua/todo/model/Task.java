package com.ua.todo.model;

import javax.persistence.*;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "task_name")
	private String taskName;
	
	@Column(name = "task_description")
	private String taskDescription;
	
	@Column(name = "task_due_date")
	private Date taskDueDate;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;
}

