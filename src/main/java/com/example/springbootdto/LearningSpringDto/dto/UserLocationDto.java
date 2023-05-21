package com.example.springbootdto.LearningSpringDto.dto;

import lombok.Data;

@Data
public class UserLocationDto {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;

}
