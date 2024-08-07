package com.rpsystem.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.rpsystem.model.Person;

@Service // itendifica para o Spring que a classe será injetada em run time para outras classes
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {	
		
		logger.info("Finding all people!");
		
		// Aqui acessaria o banco de dados para recuperar as Person
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}
	

	public Person findById(String id) {
		
		logger.info("Finding one person!");
		
		// Aqui acessaria o banco de dados para recuperar a Person
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Lucas");
		person.setLastName("Hiroshi");
		person.setAddress("Itupeva - SP - Brasil");
		person.setGender("Male");
		return person;
	}
	
	public Person create(Person person) {

		logger.info("Create one person!");
		
		// Aqui acessaria o banco de dados para gravar o novo registro
		return person;
	}
	
	public Person update(Person person) {

		logger.info("Update one person!");
		
		// Aqui acessaria o banco de dados para gravar o novo registro
		return person;
	}
	
	public void delete(String id) {

		logger.info("Deleting one person!");
		
		// Aqui acessaria o banco de dados para gravar o novo registro
	}

	private Person mockPerson(int i) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name" + i);
		person.setLastName("Last name" + i);
		person.setAddress("Some address in Brasil" + i);
		person.setGender("Male");
		return person;
	}
}
