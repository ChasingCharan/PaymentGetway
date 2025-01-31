package com.example.PaymentsGateway.service;

import com.example.PaymentsGateway.model.User;
import com.example.PaymentsGateway.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
