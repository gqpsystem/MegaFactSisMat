package com.sistemas.service;

import com.sistemas.model.Docente;

import java.util.List;

public interface IDocenteService {

    Docente registrar(Docente docente);

    void modificar(Docente docente);

    void eliminar(int idDocente);

    Docente listarId(int idDocente);

    List<Docente> listar();
}
