package com.example.springbootdto.LearningSpringDto.repository;

import com.example.springbootdto.LearningSpringDto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
