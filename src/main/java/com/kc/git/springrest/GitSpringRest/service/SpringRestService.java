package com.kc.git.springrest.GitSpringRest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kc.git.springrest.GitSpringRest.entity.Person;
import com.kc.git.springrest.GitSpringRest.repository.PersonRepository;

@Service
public class SpringRestService {

	@Autowired
	PersonRepository personRepository;
	
	public Person save(Person person) {
		
		return personRepository.save(person);
	}
	
	public Optional<Person> find(int personID) {

		return personRepository.findById(personID);
	}
}
