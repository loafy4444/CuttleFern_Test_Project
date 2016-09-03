package com.cooksys.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Group {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn
	private Interest interest;
	
	@ManyToOne
	@JoinColumn
	private City city;
	
	@ManyToMany
	@JoinTable(name = "members")
//	@JsonIgnore
	private List<Person> members;

	 public Group() {
		 
	 }
	 
	public Group(String name, City city) {
		this.name = name;
		this.city = city;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Person> getPersons() {
		return members;
	}

	public void setPersons(List<Person> members) {
		this.members = members;
	}
}
//"id": "number",
//"name": "string",
//"interest": "interest object",
//"city": "city object",
//"members": "person array"