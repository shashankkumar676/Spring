package com.spring.aop.springbootaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.springbootaop.data.Dao1;
import com.spring.aop.springbootaop.data.TrackTime;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	@TrackTime
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
}
