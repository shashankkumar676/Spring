package com.spring.test.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {

	@Value("${external.service.url}")
	private String url;

	public String returnServiceURL() {
		return url;
	}
}
