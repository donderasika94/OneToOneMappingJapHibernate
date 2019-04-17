package com.capgemini.oneToonemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.oneToonemapping.Service.PersonService;
import com.capgemini.oneToonemapping.person.Person;
import com.capgemini.oneToonemapping.person.Profile;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/new")
	public Person addPerson() {
		Person person = new Person(101,"Rasika",new Profile(210,"ABC"));
		//System.out.println("Hi");
		personService.addPerson(person);
		return person;
	}
		
	
	
}
