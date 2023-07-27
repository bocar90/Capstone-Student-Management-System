package com.perscholas.capstone.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.perscholas.capstone.model.Course;
import com.perscholas.capstone.model.Professor;
import com.perscholas.capstone.model.User;
import com.perscholas.capstone.service.CourseServiceImpl;
import com.perscholas.capstone.service.ProfessorServiceImpl;
import com.perscholas.capstone.service.StudentServiceImpl;
import com.perscholas.capstone.service.UserServiceImpl;


@SpringBootTest
class CapstoneApplicationTests {
	
	private UserServiceImpl userService;
	private StudentServiceImpl studentService;
	private ProfessorServiceImpl profServiceImpl;
	private CourseServiceImpl courseServiceImpl;
	
	@Autowired
	public CapstoneApplicationTests(UserServiceImpl userService, StudentServiceImpl studentService,
			ProfessorServiceImpl profServiceImpl, CourseServiceImpl courseServiceImpl) {
	
		this.userService = userService;
		this.studentService = studentService;
		this.profServiceImpl = profServiceImpl;
		this.courseServiceImpl = courseServiceImpl;
	}

	@Test
	void contextLoads() {
		assertNotNull(userService);
	}

	@Test
	void testFindByEmail() {
		User userRetrieved = userService.findByEmail("bocarsock5@gmail.com");
		assertNotNull(userRetrieved);
		assertEquals("bocarsock5@gmail.com", userRetrieved.getEmail());
	}
	
	@Test
	void testGetAllStudents() {
		int retrievedSize = studentService.getAllStudents().size();
		int actualSize = 2;
		assertNotNull(retrievedSize);
		assertEquals(actualSize, retrievedSize);
	}

	@Test
	void testGetProfessorById() {
		Professor retrievedProf = profServiceImpl.getProfessorById(1L);
		String actualProfEmail = "williamroales@gmail.com";
		assertNotNull(retrievedProf);
		assertEquals(actualProfEmail, retrievedProf.getEmail());
	}
	
	@Test
	void testSaveCourse() {
		Course course = new Course("Algo","Winter", 2, 5, 5);
		courseServiceImpl.saveCourse(course);
		String actualName = "Algo";
		String retrievedName = courseServiceImpl.getCourseById(3L).getCourseName();
		assertNotNull(retrievedName);
		assertEquals(actualName, retrievedName);
	}
}
