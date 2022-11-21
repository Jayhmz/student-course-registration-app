package com.plantacion.sbtutorial.model.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.plantacion.sbtutorial.model.domain.embeddable.Address;
import com.plantacion.sbtutorial.model.domain.embeddable.Phone;

import lombok.Data;

@Data
@Entity(name = "student_profiles")
public class StudentProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long studentId;
	@Embedded
	private Phone phone;
	@Embedded
	private Address homeAddress;
}
