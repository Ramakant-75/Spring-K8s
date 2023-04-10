package com.example.springbootdto.LearningSpringDto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "password")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "locationId")
    private Location location;
}
