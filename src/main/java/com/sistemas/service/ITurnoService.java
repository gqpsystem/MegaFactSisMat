package com.sistemas.service;

import com.sistemas.model.Turno;

import java.util.List;

public interface ITurnoService {

    Turno registrar(Turno turno);

    void modificar(Turno turno);

    void eliminar(int idTurno);

    Turno listarId(int idTurno);

    List<Turno> listar();
}
