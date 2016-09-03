package com.cooksys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.Person;
import com.cooksys.repository.SpringDataPersonRepository;

@Service
public class PersonService {

	@Autowired
	SpringDataPersonRepository repo;
	
	public Person get(long id){
		return repo.findOne(id);
	}
	
	public List<Person> getAll(){
		return repo.findAll();
	}
}

