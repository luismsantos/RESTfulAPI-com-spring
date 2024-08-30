package com.aprendendo.dev.service;

import com.aprendendo.dev.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate); // recebe um User para ser criado
}
