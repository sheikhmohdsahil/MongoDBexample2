package com.mongoDB.mongoDBexample2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mongoDB.mongoDBexample2.collection.Person;
import com.mongoDB.mongoDBexample2.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.stereotype.Service;


//import java.awt.print.Pageable
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {


	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private PersonRepository personRepository;
	@Override
	public String save(Person person) {

		return personRepository.save(person).getPersonId();
	}

	@Override
	public void delete(String id) {
		personRepository.deleteById(id);
	}

	@Override
	public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
		return personRepository.findPersonByAgeBetween(minAge,maxAge);
	}

	@Override
	public List<Person> getPersonStartWith(String name) {
		return personRepository.findByFirstNameStartsWith(name);
	}


}
