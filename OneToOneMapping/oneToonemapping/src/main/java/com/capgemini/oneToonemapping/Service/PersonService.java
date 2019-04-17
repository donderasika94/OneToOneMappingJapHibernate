package com.capgemini.oneToonemapping.Service;

import com.capgemini.oneToonemapping.person.Person;

public interface PersonService {
	
	public void addPerson(Person person);

	public Person getPersonById(int personId);

}
