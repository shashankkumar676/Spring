package com.spring.test.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Demo1Application {

	public static void main(String[] args) {

		// Loosely coupling example
		// BinarySearchImpl binSearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// BinarySearchImpl binSearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// System.out.println(binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3));

		// Application context
		// ConfigurableApplicationContext applicationContext =
		// SpringApplication.run(Demo1Application.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Demo1Application.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3));
		}

	}

}
