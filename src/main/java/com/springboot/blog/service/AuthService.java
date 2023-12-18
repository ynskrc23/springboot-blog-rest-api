package com.springboot.blog.service;

import com.springboot.blog.dto.requests.LoginDto;
import com.springboot.blog.dto.requests.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
