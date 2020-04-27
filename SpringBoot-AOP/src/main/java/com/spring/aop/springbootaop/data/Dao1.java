package com.spring.aop.springbootaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}

}
