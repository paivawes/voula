package com.voula.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_local")
public class Local {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocal;
	
	@NotBlank
	private String nomeLocal;
}
