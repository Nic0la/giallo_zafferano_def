package com.exercise.giallozafferano_def.model.repository;

import com.exercise.giallozafferano_def.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String Username);
}
