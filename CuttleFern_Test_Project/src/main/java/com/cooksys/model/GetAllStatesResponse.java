package com.cooksys.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.entity.State;

public class GetAllStatesResponse {

	private long id;
	
	private String name;

	public GetAllStatesResponse(long id, String name) {
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
	
	public static List<GetAllStatesResponse> list(List<State> list){
		ArrayList<GetAllStatesResponse> result = new ArrayList<>();
		for(State state : list) {
			result.add(new GetAllStatesResponse(state.getId(), state.getName()));
		}
		return result;
	}
}
