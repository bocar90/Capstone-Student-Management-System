package com.perscholas.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.capstone.model.Course;
import com.perscholas.capstone.service.CourseService;

@Controller
public class CourseController {
	
	private CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	//handles list students and return mode and view
	@GetMapping("/courses")
	public String listCourses(Model model) {
		model.addAttribute("courses", courseService.getAllCourses());
		return "courses";
	}
	
	@GetMapping("/courses/new")
	public String createCourse(Model model) {
		//create student object to hold student form data
		Course course = new Course();
		model.addAttribute("course", course);
		return "create_course";
	}
	
	@PostMapping("/courses")
	public String saveCourse(@ModelAttribute("course") Course course) {
		courseService.saveCourse(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/courses/edit/{id}")
	public String editCourse(@PathVariable Long id, Model model) {
		model.addAttribute("course", courseService.getCourseById(id));
		return "edit_course";
	}
	
	@PostMapping("/courses/{id}")
	public String updateCourse(@PathVariable Long id, @ModelAttribute("course") Course course, Model model) {
		//Retrieve student from database by id
		Course existingCourse = courseService.getCourseById(id);
		existingCourse.setId(id);
		existingCourse.setCourseName(course.getCourseName());
		existingCourse.setDifficulty(course.getDifficulty());
		existingCourse.setDuration(course.getDuration());
		existingCourse.setRating(course.getRating());
		existingCourse.setSemester(course.getSemester());
		
		//Save updated student object to database
		courseService.updateCourse(existingCourse);
		return "redirect:/courses";
	} 
	
	@GetMapping("/courses/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.deleteCourseById(id);
		return "redirect:/courses";
	}
}
