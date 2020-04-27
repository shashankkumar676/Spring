package com.database.DatabaseDemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.DatabaseDemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
