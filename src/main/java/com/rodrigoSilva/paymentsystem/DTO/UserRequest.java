package com.rodrigoSilva.paymentsystem.DTO;


import com.rodrigoSilva.paymentsystem.entities.User;

public record UserRequest (String name, String email, String password ){
    public User toModel(){
        return new User(name, email, password);
    }
}
