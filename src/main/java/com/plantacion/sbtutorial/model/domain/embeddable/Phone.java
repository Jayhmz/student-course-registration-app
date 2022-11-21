package com.plantacion.sbtutorial.model.domain.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Phone {
	
	@Column(name = "mobile_line", nullable = true)
	private String number;
	@Column(name = "home_line", nullable = true)
	private String homeLine;

}
