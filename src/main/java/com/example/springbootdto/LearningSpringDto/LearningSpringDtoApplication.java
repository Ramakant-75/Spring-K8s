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
public class LearningSpringDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringDtoApplication.class, args);
	}


}
