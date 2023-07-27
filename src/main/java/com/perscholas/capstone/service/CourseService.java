package com.perscholas.capstone.service;

import java.util.List;

import com.perscholas.capstone.model.Course;

public interface CourseService {

	List<Course> getAllCourses();
	
	Course saveCourse(Course course);
	
	Course getCourseById(Long id);
	
	Course updateCourse(Course course);
	
	void deleteCourseById(Long id);
}
