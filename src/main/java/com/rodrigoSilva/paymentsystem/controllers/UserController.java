package com.rodrigoSilva.paymentsystem.controllers;

import com.rodrigoSilva.paymentsystem.DTO.UserRequest;
import com.rodrigoSilva.paymentsystem.entities.User;
import com.rodrigoSilva.paymentsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserRequest userRequest){
       User user = userRequest.toModel();
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok().body(savedUser);
    }
}
