package com.perscholas.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perscholas.capstone.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
