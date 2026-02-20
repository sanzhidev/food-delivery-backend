package com.github.sanzhidev.fooddeliverybackend.service;

import com.github.sanzhidev.fooddeliverybackend.entity.Role;
import com.github.sanzhidev.fooddeliverybackend.entity.User;
import com.github.sanzhidev.fooddeliverybackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(String name, String email, String password) {
        User user = User.builder()
                .name(name)
                .email(email)
                .password(password)
                .role(Role.CUSTOMER)
                .build();
        return userRepository.save(user);

    }
    public User getUserById(Long id) {
       return userRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


}
