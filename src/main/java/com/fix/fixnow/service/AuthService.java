package com.fix.fixnow.service;

import com.fix.fixnow.model.User;
import com.fix.fixnow.repository.UserRepo;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    private final UserRepo userRepo;

    public AuthService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public User register(User user) {
        return userRepo.save(user);
    }


    public Optional<User> login(String email, String password) {
        return userRepo.findByEmailAndPassword(email, password);
    }
}