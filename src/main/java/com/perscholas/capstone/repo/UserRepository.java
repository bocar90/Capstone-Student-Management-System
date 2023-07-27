package com.perscholas.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.capstone.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}


