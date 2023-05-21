package com.example.springbootdto.LearningSpringDto.controller;

import com.example.springbootdto.LearningSpringDto.dto.UserLocationDto;
import com.example.springbootdto.LearningSpringDto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userslocation")
    public List<UserLocationDto> getAllUserLocation(){
        return userService.getAllUsersLocation();
    }
}
