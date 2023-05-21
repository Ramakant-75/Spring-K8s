package com.example.springbootdto.LearningSpringDto.student.controller;

import com.example.springbootdto.LearningSpringDto.student.entity.Student;
import com.example.springbootdto.LearningSpringDto.student.service.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping("/student")
public class StudentController {

   @Autowired
    private StudentRepository studentRepository;

   private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

   @GetMapping
    public ResponseEntity<List<Student>> getAll(){
       logger.info("<-----get All student details API----->");
       return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
   }

   @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id){
       logger.info("<-----get student by Id API----->");
       return new ResponseEntity<>(studentRepository.findById(Long.valueOf(id)).
               orElseThrow(()-> new IllegalStateException("Student with id " + id + " not found")),HttpStatus.OK);
   }

   @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
       logger.info("<-----create new student API----->");
       return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id){
       logger.info("<-----delete student by Id API----->");
       studentRepository.deleteById(Long.valueOf(id));
       return new ResponseEntity<>("Student deleted with id " + id, HttpStatus.NO_CONTENT);

   }
}
