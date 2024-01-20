package com.rodrigoSilva.paymentsystem.repositories;


import com.rodrigoSilva.paymentsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;



public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByEmail(String email);
}