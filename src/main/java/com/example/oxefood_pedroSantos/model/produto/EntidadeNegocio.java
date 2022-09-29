package com.example.oxefood_pedroSantos.model.produto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
@MappedSuperclass
public class EntidadeNegocio implements Serializable {

	private static final long serialVersionUID = -388438862250695360L;
	private Long id;
	private Boolean habilitado;
}
