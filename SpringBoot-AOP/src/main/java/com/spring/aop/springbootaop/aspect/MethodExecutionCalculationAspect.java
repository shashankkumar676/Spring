package com.spring.aop.springbootaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

	@Around("com.spring.aop.springbootaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		LOG.info("Time taken by {} is {}", joinpoint, timeTaken);
	}

}
