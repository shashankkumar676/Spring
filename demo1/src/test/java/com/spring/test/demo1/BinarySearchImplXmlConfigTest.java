package com.spring.test.demo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchImplXmlConfigTest {

	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	public void test() {
		int result = binarySearchImpl.binarySearch(new int[] {}, 5);
		assertEquals(3, result);
	}

}
