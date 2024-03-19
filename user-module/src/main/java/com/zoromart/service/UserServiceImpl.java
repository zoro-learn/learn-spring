package com.zoromart.service;

import com.zoromart.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String serviceTest(User data) {
        return "working of service -- "+data.getFullName();
    }
}
