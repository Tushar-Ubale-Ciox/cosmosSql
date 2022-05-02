// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmostutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

	/*
	 * @Autowired private UserRepository userRepository;
	 */
	
	@Autowired
	private CustomerDescriptionRepository customerDescriptionRepository;

	@Autowired
	private ReactiveUserRepository reactiveUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	public void run(String... var1) {
		//List<CustomerDescription> customers =  customerDescriptionRepository.findAll();
//		for (CustomerDescription custDesc: customers) {
//			logger.info("Customer" + custDesc);
//		}
		
		CustomerDescription customer =  customerDescriptionRepository.findByIdAndCustGroup("10001", "SMART");
		
		logger.info("Log"+ customer);
	}
	
	
	/*
	 * private void dataCleanInsert() { for (int i = 1; i <= 10000; i++) {
	 * 
	 * User tempUser = new User("testId" + i, "testFirstName" + (i % 10),
	 * "testLastName" + i); logger.info("Saving user : {}", tempUser);
	 * userRepository.save(tempUser); }
	 * 
	 * }
	 * 
	 * private void logTimeTaken(Instant start, Instant end, String message) {
	 * Duration timeElapsed = Duration.between(start, end);
	 * logger.info("Time taken: " + timeElapsed.toMillis() + " milliseconds" +
	 * message); }
	 */
}
