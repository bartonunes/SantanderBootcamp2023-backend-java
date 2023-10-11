package com.example.santanderdevweek2023.service;

import com.example.santanderdevweek2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
