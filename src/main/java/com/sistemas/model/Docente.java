package com.sistemas.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocente;

    @Column(name = "sueldo", nullable = false, precision = 11 , scale = 2)
    private BigDecimal sueldo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona")
    private Persona persona;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "docente_curso", joinColumns = @JoinColumn(name = "id_docente", referencedColumnName = "idDocente"), inverseJoinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "idCurso"))
    private List<Curso> cursos;

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
