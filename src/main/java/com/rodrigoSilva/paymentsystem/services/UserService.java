package com.rodrigoSilva.paymentsystem.services;



import com.rodrigoSilva.paymentsystem.DTO.UserResponse;
import com.rodrigoSilva.paymentsystem.entities.User;
import com.rodrigoSilva.paymentsystem.util.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.rodrigoSilva.paymentsystem.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserResponse registerUser(User user) {

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw  new RuntimeException("This email already exists");
        }

        String passwordEncoded = passwordEncoder.encode(user.getPassword());
        user.setPassword(passwordEncoded);

        String randomCode = RandomString.generateRandomString(64);
        user.setVerificationCode(randomCode);
        user.setEnabled(false);

        User savedUser = userRepository.save(user);

        UserResponse userResponse = new UserResponse(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail()
        );
        return userResponse;
    }
}
