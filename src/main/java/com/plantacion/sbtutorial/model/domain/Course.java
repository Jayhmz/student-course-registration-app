package com.plantacion.sbtutorial.model.domain;

import javax.persistence.Entity;

import lombok.Data;

@Entity(name = "courses")
@Data
public class Course {

	private Long id;
	private String name;
	private String code;
	
}
