package com.capgemini.oneToonemapping.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.oneToonemapping.Service.PersonService;
import com.capgemini.oneToonemapping.dao.PersonDao;
import com.capgemini.oneToonemapping.person.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Override
	public void addPerson(Person person) {
		personDao.save(person);

	}

	@Override
	public Person getPersonById(int personId) {
		return personDao.findById(personId).get();
	}

}
