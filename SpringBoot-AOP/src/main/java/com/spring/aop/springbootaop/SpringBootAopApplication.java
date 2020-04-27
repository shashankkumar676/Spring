package com.spring.aop.springbootaop;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.springbootaop.business.Business1;
import com.spring.aop.springbootaop.business.Business2;

@SpringBootApplication
public class SpringBootAopApplication implements CommandLineRunner {

	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(SpringBootAopApplication.class);

	@Autowired
	Business1 business1;
	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info(business1.calculateSomething());
		LOG.info(business2.calculateSomething());
	}

}
