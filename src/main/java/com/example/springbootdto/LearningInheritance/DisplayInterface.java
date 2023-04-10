package com.example.springbootdto.LearningInheritance;

import org.springframework.stereotype.Service;

@Service
public interface DisplayInterface extends PrintInterface{
    void display();
}
