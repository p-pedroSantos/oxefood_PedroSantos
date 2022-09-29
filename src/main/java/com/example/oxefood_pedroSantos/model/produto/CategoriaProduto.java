package com.example.oxefood_pedroSantos.model.produto;

import javax.persistence.MappedSuperclass;

import com.example.oxefood_pedroSantos.util.entety.EntidadeAuditavel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel{

	private static final long serialVersionUID = 1120479446967653591L;
	private String chaveEmpresa;
	private String descricao;
}
