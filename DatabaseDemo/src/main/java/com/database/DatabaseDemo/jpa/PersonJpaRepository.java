package com.database.DatabaseDemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.database.DatabaseDemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public Person update(Person p) {
		return entityManager.merge(p);
	}

	public Person insert(Person p) {
		return entityManager.merge(p);
	}

	public List<Person> findAll() {
		TypedQuery<Person> nm = entityManager.createNamedQuery("find_all_persons", Person.class);
		return nm.getResultList();
	}
}
