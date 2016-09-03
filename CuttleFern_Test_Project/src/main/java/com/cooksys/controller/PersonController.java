package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.Person;
import com.cooksys.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@RequestMapping("/{id}")
	public Person person(@PathVariable("id") long id) {
		return personService.get(id);
	}
	
	@RequestMapping("allPersons")
	public List<Person> allPersons() {
		return personService.getAll();
	}
}
