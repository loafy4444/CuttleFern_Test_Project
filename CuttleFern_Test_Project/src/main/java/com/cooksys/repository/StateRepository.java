package com.cooksys.repository;

import java.util.List;

import com.cooksys.entity.State;
import com.cooksys.model.GetAllStatesResponse;

public interface StateRepository {

	State get(long id);
	
	State post(String name);
	
	List<GetAllStatesResponse> getAll();
}
