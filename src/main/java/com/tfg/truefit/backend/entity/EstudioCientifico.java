package com.tfg.truefit.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudios_cientificos")
public class EstudioCientifico {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String autores;
    private Integer anio;

    @Column(unique = true)
    private String doi;

    @Column(name = "resumen_divulgativo", columnDefinition = "TEXT")
    private String resumenDivulgativo;

    @Column(name = "conclusion_clave")
    private String conclusionClave;

    private String categoria;

    @Column(name = "pdf_nombre")
    private String pdfNombre;

    @Lob
    @Column(name = "pdf_data", columnDefinition = "BYTEA")
    private byte[] pdfData;

    @Column(name = "texto_completo", columnDefinition = "TEXT")
    private String textoCompleto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getResumenDivulgativo() {
		return resumenDivulgativo;
	}

	public void setResumenDivulgativo(String resumenDivulgativo) {
		this.resumenDivulgativo = resumenDivulgativo;
	}

	public String getConclusionClave() {
		return conclusionClave;
	}

	public void setConclusionClave(String conclusionClave) {
		this.conclusionClave = conclusionClave;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPdfNombre() {
		return pdfNombre;
	}

	public void setPdfNombre(String pdfNombre) {
		this.pdfNombre = pdfNombre;
	}

	public byte[] getPdfData() {
		return pdfData;
	}

	public void setPdfData(byte[] pdfData) {
		this.pdfData = pdfData;
	}

	public String getTextoCompleto() {
		return textoCompleto;
	}

	public void setTextoCompleto(String textoCompleto) {
		this.textoCompleto = textoCompleto;
	}
    

    
}
