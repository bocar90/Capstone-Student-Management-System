package com.perscholas.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perscholas.capstone.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
