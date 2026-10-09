package com.tfg.truefit.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ejercicios")
public class Ejercicio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "grupo_muscular", nullable = false, length = 50)
    private String grupoMuscular;

    @Column(nullable = false, length = 50)
    private String equipamiento;

    @Column(name = "descripcion_tecnica", columnDefinition = "TEXT")
    private String descripcionTecnica;

}
