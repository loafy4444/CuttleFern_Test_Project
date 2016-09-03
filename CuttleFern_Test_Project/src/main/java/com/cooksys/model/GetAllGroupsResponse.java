package com.cooksys.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.entity.Group;

public class GetAllGroupsResponse {
	
	private long id;
	
	private String name;
	
	public GetAllGroupsResponse(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<GetAllGroupsResponse> list(List<Group> list)	{
		ArrayList<GetAllGroupsResponse> result = new ArrayList<>();
		for(Group group : list)
			result.add(new GetAllGroupsResponse(group.getId(), group.getName()));
		return result;
	}
}
