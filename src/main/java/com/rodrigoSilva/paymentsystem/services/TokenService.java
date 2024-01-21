package com.rodrigoSilva.paymentsystem.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.rodrigoSilva.paymentsystem.entities.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
@Service
public class TokenService {
    @Value("${jwt.secret}")
    private String secret;
    public String generateToken(User user) {

        try {

            Algorithm algorithm = Algorithm.HMAC256(secret);
            String token = JWT.create().withIssuer("auth")
                    .withSubject(user.getEmail())
                    .withExpiresAt(ExpirationDate())
                    .sign(algorithm);

            return token;

        }catch (JWTCreationException exception){
            throw new RuntimeException("Error while generating token", exception);
        }

    }

    private Instant ExpirationDate() {

        return LocalDateTime.now().plusMinutes(5).toInstant(ZoneOffset.of("-03:00"));
    }
    public String validateToken(String token){

        try {

            Algorithm algorithm = Algorithm.HMAC256(secret);
            return  JWT.require(algorithm).withIssuer("auth").build().verify(token).getSubject();

        }catch (Exception exception){

            throw new RuntimeException("Invalid token", exception);

        }
    }
}
