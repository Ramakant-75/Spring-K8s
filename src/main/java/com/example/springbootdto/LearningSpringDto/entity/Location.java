package com.example.springbootdto.LearningSpringDto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "place")
    private String place;
    @Column(name = "description")
    private String description;
    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;
}
