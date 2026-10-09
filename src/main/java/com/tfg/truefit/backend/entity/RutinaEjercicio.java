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
@Table(name="Rutina_ejercicio")
public class RutinaEjercicio {

	@EmbeddedId
    private RutinasEjercicioId id = new RutinasEjercicioId();

    @ManyToOne
    @MapsId("rutinaId")
    @JoinColumn(name = "rutina_id")
    private Rutina rutina;

    @ManyToOne
    @MapsId("ejercicioId")
    @JoinColumn(name = "ejercicio_id")
    private Ejercicio ejercicio;

    @Column(nullable = false)
    private Integer series;

    @Column(nullable = false, length = 20)
    private String repeticiones;

    @Column(name = "descanso_seg", nullable = false)
    private Integer descansoSeg;

    @Column(nullable = false)
    private Integer orden;
    
    @Embeddable
    public static class RutinasEjercicioId implements Serializable {
        
        private Long rutinaId;
        private Long ejercicioId;

        public RutinasEjercicioId() {}

        public Long getRutinaId() { return rutinaId; }
        public void setRutinaId(Long rutinaId) { this.rutinaId = rutinaId; }

        public Long getEjercicioId() { return ejercicioId; }
        public void setEjercicioId(Long ejercicioId) { this.ejercicioId = ejercicioId; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RutinasEjercicioId that = (RutinasEjercicioId) o;
            return Objects.equals(rutinaId, that.rutinaId) &&
                   Objects.equals(ejercicioId, that.ejercicioId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(rutinaId, ejercicioId);
        }
    }
    
}
