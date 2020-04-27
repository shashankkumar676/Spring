package com.database.DatabaseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.database.DatabaseDemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository dao;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Find user -> {}", dao.findById(10001));
		logger.info("All users -> {}", dao.findAll());
	}

}
