package com.example.controller;

import com.example.Model.User;
import com.example.Utils;
import com.example.dto.CreateUserRequest;
import com.example.dto.UserResponse;
import com.example.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.common.message.CreateTopicsRequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserControlller{

    @Autowired
    UserService userService;
@PostMapping("/")

    public void createUser(@RequestBody @Valid CreateUserRequest createUserRequest) throws JsonProcessingException {

    userService.create(Utils.convertUserCreateRequest(createUserRequest));
}

    @GetMapping("/user/{userId}")
    public UserResponse getUser(@PathVariable("userId") int userId) throws Exception {

    User user= userService.get(userId);
    return Utils.convertToUserResponse(user);
    }


    @GetMapping("/user/phone/{phone}")
    public UserResponse getUserByPhone(@PathVariable("phone") String phone) throws Exception {

        User user= userService.getByPhone(phone);
        return Utils.convertToUserResponse(user);
    }

}
