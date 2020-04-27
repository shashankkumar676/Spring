package com.spring.test.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDemo {

	private static Logger LOG = LoggerFactory.getLogger(XmlDemo.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOG.info("Beans Loaded --> {}", (Object) applicationContext.getBeanDefinitionNames());
			LOG.info("{}", personDAO);
		}

	}

}
