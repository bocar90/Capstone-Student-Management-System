package com.perscholas.capstone.service;

import java.util.List;

import com.perscholas.capstone.model.Professor;


public interface ProfessorService {
	
	List<Professor> getAllProfessors();
	
	Professor saveProfessor(Professor professor);
	
	Professor getProfessorById(Long id);
	
	Professor updateProfessor(Professor professor);
	
	void deleteProfessorById(Long id);
}
