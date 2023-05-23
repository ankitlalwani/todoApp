package com.ua.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ua.todo.model.Status;
import com.ua.todo.service.StatusService;

@RestController
@RequestMapping("/todo")
public class StatusController {
	@Autowired
	StatusService statusService;
	
	//add a status for
	@PostMapping("/status")
	public Status addStatus(@RequestBody Status status){
		return statusService.addStatus(status);
	}
	@GetMapping("/status")
	public Status getStatusbyName(@RequestParam String name){
		return statusService.getStatusbyName(name);
	}
}
