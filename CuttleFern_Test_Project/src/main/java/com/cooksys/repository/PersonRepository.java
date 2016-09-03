package com.cooksys.repository;

import java.util.List;

import com.cooksys.entity.Person;
import com.cooksys.model.GetAllPersonsResponse;

public interface PersonRepository {

	Person get(long id);
	
	List<GetAllPersonsResponse> getAll();
}
