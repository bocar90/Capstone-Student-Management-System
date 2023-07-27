package com.perscholas.capstone.model;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String courseName;
	private String semester;
	private int duration;
	private int difficulty;
	private int rating;
	
	public Course(String courseName, String semester, int duration, int difficulty, int rating) {
	
		this.courseName = courseName;
		this.semester = semester;
		this.duration = duration;
		this.difficulty = difficulty;
		this.rating = rating;
	}
	
	
}
