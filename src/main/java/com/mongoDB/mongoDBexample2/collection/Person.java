package com.mongoDB.mongoDBexample2.collection;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Document(collection ="person")
// so that the fields are non null that will stored in database
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
	@Id
   private String personId;
   private String firstName;
   private String lastName;
   private Integer age;
   private List<String> hobbies;
   private List<Address> addresses;



}
