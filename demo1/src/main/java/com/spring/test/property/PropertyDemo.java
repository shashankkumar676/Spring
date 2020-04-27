package com.spring.test.property;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertyDemo {

	private static Logger LOG = LoggerFactory.getLogger(PropertyDemo.class);

	public static void main(String[] args) {

		// Application context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				PropertyDemo.class)) {
			PropertyService propertyService = applicationContext.getBean(PropertyService.class);

			LOG.info("{} ", propertyService.returnServiceURL());
		}
	}

}
