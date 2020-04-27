package com.spring.test.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

class MockitoWithoutStubDemoTest {

	@org.junit.Test
	void testFindTheGreatest1() {
		DataService dataServiceMock = mock(DataService.class);
		// dataServiceMock.retrieveAllData() => new int[] {24,15,3};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });

		MockitoDemo mockitoDemo = new MockitoDemo(dataServiceMock);
		assertEquals(24, mockitoDemo.findTheGreatest());
	}

	@Test
	void testFindTheGreatest2() {
		DataService dataServiceMock = mock(DataService.class);
		// dataServiceMock.retrieveAllData() => new int[] {24,15,3};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

		MockitoDemo mockitoDemo = new MockitoDemo(dataServiceMock);
		assertEquals(15, mockitoDemo.findTheGreatest());
	}

}
