package com.cooksys.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.entity.City;
import com.cooksys.entity.State;

public class GetAllCitiesResponse {

	private long id;
	
	private String name;
	private State state;

	public GetAllCitiesResponse(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public GetAllCitiesResponse(long id, String name, State state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
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
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public static List<GetAllCitiesResponse> list(List<City> list) {
		ArrayList<GetAllCitiesResponse> result = new ArrayList<>();
		for(City city : list) {
			result.add(new GetAllCitiesResponse(city.getId(), city.getName(), city.getState()));
		}
		return result;
	}
}