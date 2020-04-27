package com.spring.test.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class CdiDemo {

	private static Logger LOG = LoggerFactory.getLogger(CdiDemo.class);

	public static void main(String[] args) {

		// Application context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				CdiDemo.class)) {
			CdiBusiness personDAO1 = applicationContext.getBean(CdiBusiness.class);

			LOG.info("{} dao-{}", personDAO1, personDAO1.getCdidao());
		}
	}

}
