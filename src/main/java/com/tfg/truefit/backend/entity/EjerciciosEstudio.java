package com.tfg.truefit.backend.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;


@Entity
@Table(name="Ejercicio_estudio")
public class EjerciciosEstudio {
	
	@EmbeddedId
    private EjerciciosEstudioId id = new EjerciciosEstudioId();

    @ManyToOne
    @MapsId("ejercicioId")
    @JoinColumn(name = "ejercicio_id")
    private Ejercicio ejercicio;

    @ManyToOne
    @MapsId("estudioId")
    @JoinColumn(name = "estudio_id")
    private EstudioCientifico estudio;

    @Column(name = "nota_aplicacion")
    private String notaAplicacion;

	public EjerciciosEstudioId getId() {
		return id;
	}

	public void setId(EjerciciosEstudioId id) {
		this.id = id;
	}

	public Ejercicio getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

	public EstudioCientifico getEstudio() {
		return estudio;
	}

	public void setEstudio(EstudioCientifico estudio) {
		this.estudio = estudio;
	}

	public String getNotaAplicacion() {
		return notaAplicacion;
	}

	public void setNotaAplicacion(String notaAplicacion) {
		this.notaAplicacion = notaAplicacion;
	}
	
	@Embeddable
    public static class EjerciciosEstudioId implements Serializable {
        
        private Long ejercicioId;
        private Long estudioId;

        public EjerciciosEstudioId() {}

        public Long getEjercicioId() { return ejercicioId; }
        public void setEjercicioId(Long ejercicioId) { this.ejercicioId = ejercicioId; }

        public Long getEstudioId() { return estudioId; }
        public void setEstudioId(Long estudioId) { this.estudioId = estudioId; }

        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EjerciciosEstudioId that = (EjerciciosEstudioId) o;
            return Objects.equals(ejercicioId, that.ejercicioId) &&
                   Objects.equals(estudioId, that.estudioId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ejercicioId, estudioId);
        }
    }
    
    

}
