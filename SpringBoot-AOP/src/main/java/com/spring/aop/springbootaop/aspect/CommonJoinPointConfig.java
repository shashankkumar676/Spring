package com.spring.aop.springbootaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.spring.aop.springbootaop.business.*.*(..))")
	public void dataLayerExecution() {

	}

	@Pointcut("@annotation(com.spring.aop.springbootaop.data.TrackTime)")
	public void trackTime() {

	}

}
