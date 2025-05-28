package com.blog.BlogProject.services;

import com.blog.BlogProject.domain.entites.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}

