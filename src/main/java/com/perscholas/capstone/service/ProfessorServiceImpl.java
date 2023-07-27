package com.perscholas.capstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perscholas.capstone.model.Professor;
import com.perscholas.capstone.repo.ProfessorRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProfessorServiceImpl implements ProfessorService{

	private ProfessorRepository professorRepository;
	
	@Override
	public List<Professor> getAllProfessors() {
		return professorRepository.findAll();
	}

	@Override
	public Professor saveProfessor(Professor professor) {
		return professorRepository.save(professor);
	}

	@Override
	public Professor getProfessorById(Long id) {
		return professorRepository.findById(id).get();
	}

	@Override
	public Professor updateProfessor(Professor professor) {
		return professorRepository.save(professor);
	}

	@Override
	public void deleteProfessorById(Long id) {
		professorRepository.deleteById(id);
	}

}
