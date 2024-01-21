package com.rodrigoSilva.paymentsystem.controllers;

import com.rodrigoSilva.paymentsystem.DTO.AuthenticationRequest;
import com.rodrigoSilva.paymentsystem.DTO.AuthenticationResponse;
import com.rodrigoSilva.paymentsystem.DTO.UserRequest;
import com.rodrigoSilva.paymentsystem.DTO.UserResponse;
import com.rodrigoSilva.paymentsystem.entities.User;
import com.rodrigoSilva.paymentsystem.services.TokenService;
import com.rodrigoSilva.paymentsystem.services.UserService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;



    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(@RequestBody @Valid  UserRequest userRequest) throws MessagingException, UnsupportedEncodingException {
       User user = userRequest.toModel();
        UserResponse savedUser = userService.registerUser(user);
        return ResponseEntity.ok().body(savedUser);
    }

    @GetMapping("/verify")
    public String verify(@Param("code") String code){
       return userService.verify(code) ? "verify_success" : "verify_fail" ;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
