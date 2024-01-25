package com.sisdis.seguridad.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "modulo_vista")
public class ModuloVista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "modulo_id", nullable = false, unique = true)	
	private Modulo moduloId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "vista_id", nullable = false, unique = true)	
	private Vista vistaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Modulo getModuloId() {
		return moduloId;
	}

	public void setModuloId(Modulo moduloId) {
		this.moduloId = moduloId;
	}

	public Vista getVistaId() {
		return vistaId;
	}

	public void setVistaId(Vista vistaId) {
		this.vistaId = vistaId;
	}
}


