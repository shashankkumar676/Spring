package com.spring.aop.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(AfterAopAspect.class);

	@AfterReturning(value = "com.spring.aop.springbootaop.aspect.CommonJoinPointConfig.dataLayerExecution()", returning = "result")
	public void afterReturning(JoinPoint joinpoint, Object result) {
		LOG.info("{} returned with value {}", joinpoint, result);
	}

	@AfterThrowing(value = "execution(* com.spring.aop.springbootaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinpoint, Exception exception) {
		LOG.info("{} returned with value {}", joinpoint, exception);
	}
}
