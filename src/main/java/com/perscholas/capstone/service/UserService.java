package com.perscholas.capstone.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.perscholas.capstone.model.User;
import com.perscholas.capstone.repo.UserRegistrationDto;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}
