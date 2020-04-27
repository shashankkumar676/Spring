package com.spring.test.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class MockitoAnnotationsDemoTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	MockitoDemo mockitoDemo = new MockitoDemo(dataServiceMock);

	@org.junit.Test
	public void testFindTheGreatest1() {
		// DataService dataServiceMock = mock(DataService.class);
		// dataServiceMock.retrieveAllData() => new int[] {24,15,3};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });

		// MockitoDemo mockitoDemo = new MockitoDemo(dataServiceMock);
		assertEquals(24, mockitoDemo.findTheGreatest());
	}

	@org.junit.Test
	public void testFindTheGreatest2() {
		// DataService dataServiceMock = mock(DataService.class);
		// dataServiceMock.retrieveAllData() => new int[] {24,15,3};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

		// MockitoDemo mockitoDemo = new MockitoDemo(dataServiceMock);
		assertEquals(15, mockitoDemo.findTheGreatest());
	}

}
