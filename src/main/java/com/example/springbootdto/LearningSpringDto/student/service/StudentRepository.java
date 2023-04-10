package com.example.springbootdto.LearningSpringDto.student.service;

import com.example.springbootdto.LearningSpringDto.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
