package com.example;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class ServiceClientApplication {
	
	@Autowired TimeOperations timeOperations;
	
	@RequestMapping(method=GET, value="/timeNow")
	public String getTimeNow() {
		return timeOperations.getTimeNow();
	}

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }
}
