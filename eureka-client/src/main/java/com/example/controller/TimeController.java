package com.example.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

	@RequestMapping(method=GET, value="/time")
	public String getTimeNow() {
		return LocalDateTime.now().toString();
	}
}
