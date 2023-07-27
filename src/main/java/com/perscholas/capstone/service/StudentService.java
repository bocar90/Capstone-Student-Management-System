package com.perscholas.capstone.service;

import java.util.List;

import com.perscholas.capstone.model.Student;


public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
