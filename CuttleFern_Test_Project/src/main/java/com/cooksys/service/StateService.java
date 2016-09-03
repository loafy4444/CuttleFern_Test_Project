package com.cooksys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.State;
import com.cooksys.repository.SpringDataStateRepository;

@Service
public class StateService {

	@Autowired
	SpringDataStateRepository repo;
	
	public State get(long id){
		return repo.findOne(id);
	}
	
	public List<State> getAll(){
		return repo.findAll();
	}
}