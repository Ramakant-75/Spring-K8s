package com.example.springbootdto.LearningSpringDto;

import com.example.springbootdto.LearningSpringDto.entity.Location;
import com.example.springbootdto.LearningSpringDto.entity.User;
import com.example.springbootdto.LearningSpringDto.repository.LocationRepository;
import com.example.springbootdto.LearningSpringDto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Banglore");
		location.setDescription("Banglore is peaceful place");
		location.setLongitude(40.7);
		location.setLatitude(87.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Ramakant");
		user1.setLastName("Gachi");
		user1.setEmail("ramakantgachi@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Nikhil");
		user2.setLastName("Gachi");
		user2.setEmail("nikhilgachi@gmail.com");
		user2.setPassword("secret123");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
