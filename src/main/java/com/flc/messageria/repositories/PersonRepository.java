package com.flc.messageria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flc.messageria.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	public Person getByName(String name);
}
