package com.kc.git.springrest.GitSpringRest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kc.git.springrest.GitSpringRest.entity.Person;
import com.kc.git.springrest.GitSpringRest.service.SpringRestService;

@RestController
@RequestMapping("/rest")
public class SpringRestController {

	@Autowired
	private SpringRestService springRestService;
	/**
	 * First Rest Controller
	 * @param param
	 * @return String
	 */
	@GetMapping("/hello/{param}")
	public String hello(@PathVariable String param) {
		
		return "Hello " +param;
	}
	
	/**
	 * Thhird Rest Controller
	 * @param param
	 * @return String
	 */
	@GetMapping("/hi/{param}")
	public String hi(@PathVariable String param1) {
		
		return "Hi " +param1;
	}
	
	@PostMapping("/person")
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {
		
		Person personSaved = springRestService.save(person);
		
		return new ResponseEntity<Person>(personSaved, HttpStatus.CREATED);
	}
	
	@GetMapping("/person")
	public ResponseEntity<Person> person(@RequestParam Integer personId) {
		
		Optional<Person> personSaved = springRestService.find(personId);
		
		if(personSaved.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Person>(personSaved.get(), HttpStatus.OK);
	}
}
