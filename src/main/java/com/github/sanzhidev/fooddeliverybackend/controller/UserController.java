package com.github.sanzhidev.fooddeliverybackend.controller;

import com.github.sanzhidev.fooddeliverybackend.entity.User;
import com.github.sanzhidev.fooddeliverybackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();

    }

    @PostMapping
    public User createUser(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password
    ) {
        return userService.createUser(name, email, password);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }


}
