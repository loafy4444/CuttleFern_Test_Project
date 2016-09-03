package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.Group;
import com.cooksys.service.GroupService;

@RestController
@RequestMapping("group")
public class GroupController {

	@Autowired
	private GroupService groupService;

	@RequestMapping("/{id}")
	public Group group(@PathVariable("id") long id) {
		return groupService.get(id);
	}
	
	@RequestMapping("allGroups")
	public List<Group> allGroups() {
		return groupService.getAll();
	}

}
