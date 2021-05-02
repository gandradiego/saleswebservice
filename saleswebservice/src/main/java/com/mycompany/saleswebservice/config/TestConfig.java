package com.mycompany.saleswebservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mycompany.saleswebservice.entities.User;
import com.mycompany.saleswebservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		if (userRepository.count() == 0) {
			User u1 = new User(null, "John Smith", "john.smith@gmail.com", "988887777", "123456");
			User u2 = new User(null, "Carl Steves", "carl.steves@gmail.com", "911112222", "123456");
			
			userRepository.saveAll(Arrays.asList(u1, u2));
		}
	}
	
	
}
