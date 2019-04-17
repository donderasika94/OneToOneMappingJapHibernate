package com.capgemini.oneToonemapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.oneToonemapping.person.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
