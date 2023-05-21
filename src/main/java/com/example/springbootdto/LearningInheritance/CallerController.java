package com.example.springbootdto.LearningInheritance;

import org.springframework.beans.factory.annotation.Autowired;

public class CallerController {

    @Autowired
    private DisplayInterface display;

    @Autowired
    private PrintInterface print;
}
