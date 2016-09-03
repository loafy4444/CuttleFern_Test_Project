package com.cooksys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.Group;
import com.cooksys.repository.SpringDataGroupRepository;

@Service
public class GroupService {

	@Autowired
	SpringDataGroupRepository repo;
	
	public Group get(long id){
		return repo.findOne(id);
	}
	
	public List<Group> getAll(){
		return repo.findAll();
	}
}

