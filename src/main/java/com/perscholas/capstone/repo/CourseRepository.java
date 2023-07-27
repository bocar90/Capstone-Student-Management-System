package com.perscholas.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perscholas.capstone.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
