package com.mongoDB.mongoDBexample2.service;

import com.mongoDB.mongoDBexample2.collection.Person;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;


public interface PersonService {



	List<Person> getPersonStartWith(String name);

	String save(Person person);

	void delete(String id);

	List<Person> getByPersonAge(Integer minAge, Integer maxAge);


}
