package com.ua.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.todo.model.Status;
import com.ua.todo.repo.StatusRepository;
@Service
public class StatusService {
	@Autowired
	private StatusRepository statusRepository;
	
	public Status addStatus(Status status){
		return statusRepository.save(status);
	}
	
	public Status getStatusbyName(String statusName){
		return statusRepository.getStatusByName(statusName);
	}
	
	public Status updateStatus(Status status){
		return statusRepository.save(status);
		
	}
}
