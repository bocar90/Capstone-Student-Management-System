package com.perscholas.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.capstone.model.Professor;
import com.perscholas.capstone.service.ProfessorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class ProfessorController {
	
	private ProfessorService professorService;
	
	//handles list students and return mode and view
	@GetMapping("/professors")
	public String listProfessors(Model model) {
		model.addAttribute("professors", professorService.getAllProfessors());
		return "professors";
	}
	
	@GetMapping("/professors/new")
	public String createProfessor(Model model) {
		//create student object to hold student form data
		Professor professor = new Professor();
		model.addAttribute("professor", professor);
		return "create_professor";
	}
	
	@PostMapping("/professors")
	public String saveProfessor(@ModelAttribute("professor") Professor professor) {
		professorService.saveProfessor(professor);
		return "redirect:/professors";
	}
	
	@GetMapping("/professors/edit/{id}")
	public String editProfessor(@PathVariable Long id, Model model) {
		model.addAttribute("professor", professorService.getProfessorById(id));
		return "edit_professor";
	}
	
	@PostMapping("/professors/{id}")
	public String updateProfessor(@PathVariable Long id, @ModelAttribute("professor") Professor professor, Model model) {
		//Retrieve student from database by id
		Professor existingProfessor = professorService.getProfessorById(id);
		existingProfessor.setId(id);
		existingProfessor.setFirstName(professor.getFirstName());
		existingProfessor.setLastName(professor.getLastName());
		existingProfessor.setEmail(professor.getEmail());
		existingProfessor.setAddress(professor.getAddress());
		existingProfessor.setCourse(professor.getCourse());
		
		//Save updated student object to database
		professorService.updateProfessor(existingProfessor);
		return "redirect:/professors";
	} 
	
	@GetMapping("/professors/{id}")
	public String deleteProfessor(@PathVariable Long id) {
		professorService.deleteProfessorById(id);
		return "redirect:/professors";
	}
}
