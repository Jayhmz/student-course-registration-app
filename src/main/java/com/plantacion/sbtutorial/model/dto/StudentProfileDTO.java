package com.plantacion.sbtutorial.model.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.plantacion.sbtutorial.model.domain.Student;
import com.plantacion.sbtutorial.model.domain.embeddable.Address;
import com.plantacion.sbtutorial.model.domain.embeddable.Phone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StudentProfileDTO {

	@NotNull
	@JsonProperty("studentId")
	private Student student;
	@JsonProperty("addresses")
	private List<Address> address;
	@NotNull
	@JsonProperty("phoneNumbers")
	private List<Phone> phone;
}
