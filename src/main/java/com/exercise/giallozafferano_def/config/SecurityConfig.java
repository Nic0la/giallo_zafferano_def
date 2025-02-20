package com.exercise.giallozafferano_def.config;



import com.exercise.giallozafferano_def.model.repository.UserRepository;
import com.exercise.giallozafferano_def.model.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//        List<UserDetails> userList = new ArrayList<>();
//        userList.add(new User(
//                "user", encoder.encode("password"),
//                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
//        userList.add(new User(
//                "admin", encoder.encode("admin"),
//                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority("ROLE_ADMIN"))));
//        return new InMemoryUserDetailsManager(userList);
//    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepo){
        return username -> {
            User user = userRepo.findByUsername(username);
            if (user != null) return user;
            throw new UsernameNotFoundException("User '" + username + "' not found");
        };
    }

    @Bean
    public SecurityFilterChain ilterChain(HttpSecurity http) throws Exception {
        return http.build();
    }

}
