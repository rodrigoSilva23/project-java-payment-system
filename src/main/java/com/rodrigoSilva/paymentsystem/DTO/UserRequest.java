package com.rodrigoSilva.paymentsystem.DTO;


import com.rodrigoSilva.paymentsystem.entities.User;
import jakarta.validation.constraints.*;

public record UserRequest (
        @NotNull(message = "Name cannot be null")
        @NotBlank(message = "Name cannot be blank")
        @Size(max = 100, message = "Name cannot be longer than 100 characters")
        String name,
        @NotNull(message = "Name cannot be null")
        @NotBlank(message = "Name cannot be blank")
        @Email(message = "Email is not valid")
        String email,
        @NotNull(message = "Name cannot be null")
        @NotBlank(message = "Name cannot be blank")
        @Size(min = 8,message = "Name cannot be less than 8 characters")
        String password
){
    public User toModel(){
        return new User(name, email, password);
    }
}
