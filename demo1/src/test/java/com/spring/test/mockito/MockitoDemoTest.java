package com.spring.test.mockito;

import static org.junit.Assert.assertEquals;

class MockitoDemoTest {

	@org.junit.Test
	void testFindTheGreatest() {
		MockitoDemo mockitoDemo = new MockitoDemo(new DataServiceStub());
		assertEquals(24, mockitoDemo.findTheGreatest());
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 24, 6, 15 };
	}

}