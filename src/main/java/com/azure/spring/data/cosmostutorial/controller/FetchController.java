package com.azure.spring.data.cosmostutorial.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.data.cosmostutorial.SampleApplication;

@RestController
public class FetchController {

	private final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

//	@Autowired
//	private UserRepository userRepository;

	@GetMapping("/hello")
	public String fetchDataByFirstName() {
		return "Hello";
//		long startTime2 = System.currentTimeMillis();
//		List<User> users = userRepository.findByFirstName("testFirstName1");
//
//		logger.info("Users by firstName : testFirstName");
//		for (User user: users) {
//			logger.info("user is : {}", user);
//		}
//		long endTime2 = System.currentTimeMillis();
//		long elapsedTime2 = endTime2 - startTime2;
//		logger.info("time taken for findByFirstName "+ elapsedTime2 + " start " + startTime2 + " end " + endTime2 );;

	}
	
}
