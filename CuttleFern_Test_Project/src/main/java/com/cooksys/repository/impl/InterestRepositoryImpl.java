package com.cooksys.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.entity.Interest;
import com.cooksys.model.GetAllInterestsResponse;
import com.cooksys.repository.InterestRepository;

@Repository
public class InterestRepositoryImpl implements InterestRepository {

	@Autowired
	EntityManager em;

	@Override
	public Interest get(long id) {
		return em.createQuery("select interest from Interest interest where interest.id = :id", Interest.class).setParameter("id", id)
				.getSingleResult();
	}

	@Override
	public List<GetAllInterestsResponse> getAll() {
		return em.createQuery("select new com.cooksys.model.GetAllInterestsResponse(interest.id, interest.name) from Interest interest",
				GetAllInterestsResponse.class).getResultList();
	}
}