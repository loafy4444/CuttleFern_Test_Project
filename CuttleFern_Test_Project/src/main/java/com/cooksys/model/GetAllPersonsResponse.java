package com.cooksys.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.entity.Person;

public class GetAllPersonsResponse {

	private long id;
	
	private String name;
	
	public GetAllPersonsResponse(long id, String name) {
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
	
	public static List<GetAllPersonsResponse> list(List<Person> list){
		ArrayList<GetAllPersonsResponse> result = new ArrayList<>();
		for(Person person : list)
			result.add(new GetAllPersonsResponse(person.getId(), person.getName()));
		return result;
	}
}
