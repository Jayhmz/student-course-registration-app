package com.plantacion.sbtutorial.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "course_title", nullable = false)
	private String name;
	@Column(name = "course_code", nullable = false)
	private String code;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinTable(name = "student_assignment", 
			   joinColumns = @JoinColumn(name = "course_id"), 
			   inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> student;
	
	@OneToMany(mappedBy = "course")
	private List<Assignment> assignment;
	
}
