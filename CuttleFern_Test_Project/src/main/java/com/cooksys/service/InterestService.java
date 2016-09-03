package com.cooksys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.Interest;
import com.cooksys.repository.SpringDataInterestRepository;

@Service
public class InterestService {

	@Autowired
	SpringDataInterestRepository repo;
	
	public Interest get(long id){
		return repo.findOne(id);
	}
		
	public List<Interest> getAll(){
		return repo.findAll();
	}
}

