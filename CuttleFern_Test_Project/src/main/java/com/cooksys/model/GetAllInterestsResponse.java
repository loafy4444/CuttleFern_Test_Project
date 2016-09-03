package com.cooksys.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.entity.Interest;

public class GetAllInterestsResponse {

	private long id;
	
	private String name;
	
	public GetAllInterestsResponse(long id, String name) {
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
	
	public static List<GetAllInterestsResponse> list(List<Interest> list){
		ArrayList<GetAllInterestsResponse> result = new ArrayList<>();
		for(Interest interest : list)
			result.add(new GetAllInterestsResponse(interest.getId(), interest.getName()));
		return result;
	}
}
