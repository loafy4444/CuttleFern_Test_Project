package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.City;
import com.cooksys.service.CityService;

@RestController
@RequestMapping("city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/{id}")
	public City city(@PathVariable("id") long id) {
		return cityService.get(id);
	}
	
	@RequestMapping("allCities")
	public List<City> allCities() {
		return cityService.getAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public City city1(@PathVariable("id") long id) {
		return cityService.delete(id);
	}

}
