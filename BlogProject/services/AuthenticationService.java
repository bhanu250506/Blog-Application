package com.blog.BlogProject.services;

import com.blog.BlogProject.domain.dtos.AuthResponse;
import com.blog.BlogProject.domain.dtos.RegisterRequest;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthenticationService {

    UserDetails authenticate(String email, String password);
    String generateToken(UserDetails userDetails);
    UserDetails validateToken(String token);

    AuthResponse register(RegisterRequest request);

}
