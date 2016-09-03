package com.cooksys.repository;

import java.util.List;

import com.cooksys.entity.Group;
import com.cooksys.model.GetAllGroupsResponse;

public interface GroupRepository {

	Group get(long id);
		
	List<GetAllGroupsResponse> getAll();
}
