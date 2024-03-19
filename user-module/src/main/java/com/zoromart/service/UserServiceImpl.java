package com.zoromart.service;

import com.zoromart.dao.UserRepository;
import com.zoromart.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String serviceTest(User data) {
        return "working of service -- "+data.getFullName();
    }
}
