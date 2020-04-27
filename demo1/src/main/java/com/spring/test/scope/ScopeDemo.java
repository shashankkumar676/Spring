package com.spring.test.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class ScopeDemo {

	private static Logger LOG = LoggerFactory.getLogger(ScopeDemo.class);

	public static void main(String[] args) {

		// Application context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ScopeDemo.class)) {
			PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOG.info("{}", personDAO1);
			LOG.info("{}", personDAO1.getJdbcConnection());

			LOG.info("{}", personDAO2);
			LOG.info("{}", personDAO2.getJdbcConnection());
		}
	}

}
