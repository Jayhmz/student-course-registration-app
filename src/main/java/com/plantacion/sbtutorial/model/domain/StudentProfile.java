package com.plantacion.sbtutorial.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
@Entity(name = "student_profile")
public class StudentProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(mappedBy = "profile")
	private Student student;
	
	@Embedded
	@AttributeOverrides({ 
		
		@AttributeOverride(name = "street", column = @Column(name = "home_street", nullable = true)) ,
		@AttributeOverride(name = "city", column = @Column(name = "home_city", nullable = true)) ,
		@AttributeOverride(name = "state", column = @Column(name = "home_state", nullable = true)), 
		@AttributeOverride(name = "country", column = @Column(name = "home_country", nullable = true)) 
		
	})
	private Address homeAddress;
	@Embedded
	@AttributeOverrides({ 
		
		@AttributeOverride(name = "street", column = @Column(name = "hostel_street", nullable = true)) ,
		@AttributeOverride(name = "city", column = @Column(name = "hostel_city", nullable = true)) ,
		@AttributeOverride(name = "state", column = @Column(name = "hostel_state", nullable = true)), 
		@AttributeOverride(name = "country", column = @Column(name = "hostel_country", nullable = true)) 
		
	})
	private Address hostelAddress;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="number", column = @Column(name = "home_line", nullable = true))
	})
	private Phone homePhone;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="number", column = @Column(name = "hot_line", nullable = true))
	})
	private Phone mobilePhone;
	

}
