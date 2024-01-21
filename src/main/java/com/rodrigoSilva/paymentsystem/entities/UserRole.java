package com.rodrigoSilva.paymentsystem.entities;

public enum UserRole {
    USER("user"),
    ADMIN("admin");

    private String role;

    UserRole(){

    }
    UserRole(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
