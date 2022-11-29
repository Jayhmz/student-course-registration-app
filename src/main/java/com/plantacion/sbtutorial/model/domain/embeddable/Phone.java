package com.plantacion.sbtutorial.model.domain.embeddable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Phone {

	private String number;

}
