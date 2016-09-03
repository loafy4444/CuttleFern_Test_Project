package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.Interest;
import com.cooksys.service.InterestService;

@RestController
@RequestMapping("interest")
public class InterestController {
	
	@Autowired
	private InterestService interestService;

	@RequestMapping("/{id}")
	public Interest interest(@PathVariable("id") long id) {
		return interestService.get(id);
	}
	
	@RequestMapping("allInterests")
	public List<Interest> allInterests() {
		return interestService.getAll();
	}

}