package com.perscholas.capstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perscholas.capstone.model.Course;
import com.perscholas.capstone.repo.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService{

	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);
	}

}
