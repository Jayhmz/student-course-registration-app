package com.plantacion.sbtutorial.model.domain.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "street", nullable = true)
	private String street;
	@Column(name = "city", nullable = true)
	private String city;
	@Column(name = "state", nullable = true)
	private String state;
	@Column(name = "country", nullable = true)
	private String country;
}
