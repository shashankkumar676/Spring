package com.spring.ststest.basictest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// BeanFactory beanFactory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("classlevelspring.xml");
		Alien alien = (Alien) beanFactory.getBean("Alien");
		alien.code();
		System.out.println(alien.getAge());
	}
}
