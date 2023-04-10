package com.example.springbootdto.LearningSpringDto.repository;

import com.example.springbootdto.LearningSpringDto.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
