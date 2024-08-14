package com.example;

import com.example.Model.User;
import com.example.dto.CreateUserRequest;
import com.example.dto.UserResponse;

public class Utils {
    public static User convertUserCreateRequest(CreateUserRequest request){
        return User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .age(request.getAge())
                .build();
    }

    public static UserResponse convertToUserResponse(User user){
        return UserResponse.builder()
                .name(user.getName())
                .phone(user.getPhone())
                .age(user.getAge())
                .email(user.getEmail())
                .build();
    }
}
