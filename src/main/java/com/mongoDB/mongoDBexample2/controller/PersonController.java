package com.mongoDB.mongoDBexample2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import com.mongoDB.mongoDBexample2.collection.Person;
import com.mongoDB.mongoDBexample2.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	@PostMapping
	public String save(@RequestBody Person person) {
		
		return personService.save(person);
		



	}
     @GetMapping
	public List<Person> getPersonStartWith(@RequestParam("name") String name){

		return personService.getPersonStartWith(name);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id){
		personService.delete(id);

	}

	@GetMapping("/age")
	public List<Person> getByPersonAge(@RequestParam Integer minAge,@RequestParam Integer maxAge){

		return  personService.getByPersonAge(minAge,maxAge);
	}

}
