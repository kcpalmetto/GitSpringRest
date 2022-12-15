package com.kc.git.springrest.GitSpringRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kc.git.springrest.GitSpringRest.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
