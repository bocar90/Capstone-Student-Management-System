package com.perscholas.capstone.model;

import javax.persistence.*;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email", unique=true)
	private String email;
	
	@Column(name="address")
	private String address;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Course course;
	
	public Student(String firstName, String lastName, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String courseId() {
		if(this.course == null)
			return "No Course";
		else
			return course.getId().toString();
	}
}
