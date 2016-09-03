package com.cooksys.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.entity.Person;
import com.cooksys.model.GetAllPersonsResponse;
import com.cooksys.repository.PersonRepository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Autowired
	EntityManager em;

	@Override
	public Person get(long id) {
		return em.createQuery("select person from Person person where person.id = :id", Person.class).setParameter("id", id).getSingleResult();
	}
	
	@Override
	public List<GetAllPersonsResponse> getAll() {
		return em.createQuery("select new com.cooksys.model.GetAllPersonsResponse(person.id, person.name) from Person person",
				GetAllPersonsResponse.class).getResultList();
	}
}
