package com.rpsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpsystem.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
