package com.example.oxefood_pedroSantos.util.entety;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import com.example.oxefood_pedroSantos.model.produto.EntidadeNegocio;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
@MappedSuperclass
public abstract class EntidadeAuditavel extends EntidadeNegocio {

	private static final long serialVersionUID = -1427823437079806964L;
	private Long versao;
	private LocalDate dataCriacao;
	private LocalDate DataUltimaModificacao;
	private Long criadoPor;
	private Long ultimaModificaoPor;
}
