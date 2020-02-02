package com.sistemas.model;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column(name = "razonSocial", nullable = false, length = 100)
    private String razonSocial;

    @Column(name = "numDocumnto", nullable = false, length = 11)
    private String numDocumnto;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumDocumnto() {
        return numDocumnto;
    }

    public void setNumDocumnto(String numDocumnto) {
        this.numDocumnto = numDocumnto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
