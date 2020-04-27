package com.spring.test.mockito;

public class MockitoDemo {

	private DataService dataService;

	public MockitoDemo(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatest() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
