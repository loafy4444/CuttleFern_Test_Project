package com.cooksys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.City;
import com.cooksys.repository.SpringDataCityRepository;

@Service
public class CityService {

	@Autowired
	SpringDataCityRepository repo;
	
	public City get(long id){
		return repo.findOne(id);
	}
	
	public List<City> getAll(){
		return repo.findAll();
	}
	
	public City delete(long id){
		City temp = repo.findOne(id);
		repo.delete(id);
		return temp;
	}
}
