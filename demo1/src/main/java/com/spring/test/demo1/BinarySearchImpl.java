package com.spring.test.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	private static Logger LOG = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		LOG.info("Post Construct called");
	}

	@PreDestroy
	public void preDestroy() {
		LOG.info("Pre Destroy called");
	}

}
