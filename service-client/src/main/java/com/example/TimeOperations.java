package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("time-service")
public interface TimeOperations {

	@RequestMapping(method=RequestMethod.GET, value="/time")
	public String getTimeNow();
	
}
