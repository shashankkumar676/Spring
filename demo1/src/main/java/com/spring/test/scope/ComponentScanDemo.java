package com.spring.test.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.spring.test.componentscan.ComponentPersonDAO;

@Component
@ComponentScan("com.spring.test.componentscan")
public class ComponentScanDemo {

	private static Logger LOG = LoggerFactory.getLogger(ComponentScanDemo.class);

	public static void main(String[] args) {

		// Application context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ComponentScanDemo.class);) {
			ComponentPersonDAO personDAO1 = applicationContext.getBean(ComponentPersonDAO.class);

			LOG.info("{}", personDAO1);
			LOG.info("{}", personDAO1.getJdbcConnection());
		}
	}

}
