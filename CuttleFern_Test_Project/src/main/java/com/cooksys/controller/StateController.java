package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.State;
import com.cooksys.service.StateService;

@RestController
@RequestMapping("state")
public class StateController {
	
	@Autowired
	private StateService stateService;

	@RequestMapping("/{id}")
	public State state(@PathVariable("id") long id) {
		return stateService.get(id);
	}
	
	@RequestMapping("allStates")
	public List<State> allStates() {
		return stateService.getAll();
	}

}
