package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

public static void main(String[] args) {

		ConfigurableApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		Alien obj = appContext.getBean(Alien.class);
		obj.code();
	}

}
