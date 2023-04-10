package com.example.springbootdto.LearningSpringDto.service;

import com.example.springbootdto.LearningSpringDto.dto.UserLocationDto;
import com.example.springbootdto.LearningSpringDto.entity.User;
import com.example.springbootdto.LearningSpringDto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDto> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDto convertEntityToDto(User user){
        UserLocationDto userLocationDto = new UserLocationDto();
        userLocationDto.setUserId(user.getId());
        userLocationDto.setEmail(user.getEmail());
        userLocationDto.setPlace(user.getLocation().getPlace());
        userLocationDto.setLongitude(user.getLocation().getLongitude());
        userLocationDto.setLatitude(user.getLocation().getLatitude());

        return userLocationDto;
    }
}
