package com.cooksys.repository;

import java.util.List;

import com.cooksys.entity.Interest;
import com.cooksys.model.GetAllInterestsResponse;

public interface InterestRepository {

	Interest get(long id);
	
	List<GetAllInterestsResponse> getAll();
}
