package com.plantacion.sbtutorial.model.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StudentDTO {

	@NotNull
	private String fullname;
	@NotNull
	private String username;
	@NotNull
	private String email;
	
//	private StudentProfileDTO profile;
//	private CourseDTO course;
//	private AssignmentDTO assignment;
}
