package com.kc.git.springrest.GitSpringRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SpringRestController {

	/**
	 * First Rest Controller
	 * @param param
	 * @return String
	 */
	@GetMapping("/hello/{param}")
	public String hello(@PathVariable String param) {
		
		return "Hello " +param;
	}
}
