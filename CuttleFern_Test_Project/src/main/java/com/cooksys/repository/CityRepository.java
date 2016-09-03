package com.cooksys.repository;

import java.util.List;

import com.cooksys.entity.City;
import com.cooksys.model.GetAllCitiesResponse;

public interface CityRepository {

	City get(long id);
	
	List<GetAllCitiesResponse> getAll();
}
