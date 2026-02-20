package com.github.sanzhidev.fooddeliverybackend.dto;

import com.github.sanzhidev.fooddeliverybackend.entity.Role;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private Role role;
}
