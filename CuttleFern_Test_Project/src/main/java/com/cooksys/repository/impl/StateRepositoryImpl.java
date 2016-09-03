package com.cooksys.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.entity.State;
import com.cooksys.model.GetAllStatesResponse;
import com.cooksys.repository.StateRepository;

@Repository
public class StateRepositoryImpl implements StateRepository {

	@Autowired
	EntityManager em;

	@Override
	public State get(long id) {
		return em.createQuery("select state from State state where state.id = :id", State.class).setParameter("id", id)
				.getSingleResult();
	}
	
	@Override
	public State post(String name) {
		em.createQuery("insert into State (name)");
		
		return em.createQuery("select state from State state where state.name = :name", State.class).setParameter("name", name)
				.getSingleResult();
		
//		"INSERT INTO Employee(firstName, lastName, salary)"  + 
//        "SELECT firstName, lastName, salary FROM old_employee";
	}

	@Override
	public List<GetAllStatesResponse> getAll() {
		return em.createQuery("select new com.cooksys.model.GetAllStatesResponse(state.id, state.name) from State state",
				GetAllStatesResponse.class).getResultList();
	}
}
