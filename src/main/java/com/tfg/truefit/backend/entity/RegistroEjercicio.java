package com.tfg.truefit.backend.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro_ejercicio")
public class RegistroEjercicio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sesion_id", nullable = false)
    private SesionEntrenamiento sesion;

    @ManyToOne
    @JoinColumn(name = "ejercicio_id", nullable = false)
    private Ejercicio ejercicio;

    @Column(name = "num_serie", nullable = false)
    private Integer numSerie;

    @Column(name = "peso_kg", nullable = false, precision = 5, scale = 2)
    private BigDecimal pesoKg;

    @Column(name = "repeticiones_realizadas", nullable = false)
    private Integer repeticionesRealizadas;

    @Column(precision = 3, scale = 1)
    private BigDecimal rpe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SesionEntrenamiento getSesion() {
		return sesion;
	}

	public void setSesion(SesionEntrenamiento sesion) {
		this.sesion = sesion;
	}

	public Ejercicio getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

	public Integer getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(Integer numSerie) {
		this.numSerie = numSerie;
	}

	public BigDecimal getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(BigDecimal pesoKg) {
		this.pesoKg = pesoKg;
	}

	public Integer getRepeticionesRealizadas() {
		return repeticionesRealizadas;
	}

	public void setRepeticionesRealizadas(Integer repeticionesRealizadas) {
		this.repeticionesRealizadas = repeticionesRealizadas;
	}

	public BigDecimal getRpe() {
		return rpe;
	}

	public void setRpe(BigDecimal rpe) {
		this.rpe = rpe;
	}
    
    

}
