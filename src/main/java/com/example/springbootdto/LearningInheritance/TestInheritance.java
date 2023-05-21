package com.example.springbootdto.LearningInheritance;

import org.springframework.stereotype.Component;

@Component
public class TestInheritance implements DisplayInterface{

    @Override
    public void display() {
        System.out.println("trying to display");
    }

    @Override
    public void print() {
        System.out.println("trying to print");
    }
}
