package com.cooksys.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.entity.City;
import com.cooksys.model.GetAllCitiesResponse;
import com.cooksys.repository.CityRepository;

@Repository
public class CityRepositoryImpl implements CityRepository {

	@Autowired
	EntityManager em;
	
	@Override
	public City get(long id) {
		return em.createQuery("select city from City city where city.id = :id", City.class).setParameter("id", id)
				.getSingleResult();
	}

	@Override
	public List<GetAllCitiesResponse> getAll() {
		return em.createQuery("select new com.cooksys.model.GetAllCitiesResponse(city.id, city.name) from City city",
				GetAllCitiesResponse.class).getResultList();
	}
}
