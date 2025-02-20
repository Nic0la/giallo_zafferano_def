package com.exercise.giallozafferano_def.config;

import com.exercise.giallozafferano_def.model.entity.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    private String username;
    private String password;


    public User toUser(PasswordEncoder passwordEncoder){
        return new User(
                username, passwordEncoder.encode(password)
        );
    }

}
