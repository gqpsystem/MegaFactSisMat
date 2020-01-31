package com.sistemas.service;

import com.sistemas.model.Curso;

import java.util.List;

public interface ICursoService {

    Curso registrar(Curso curso);

    void modificar(Curso curso);

    void eliminar(int idCurso);

    Curso listarId(int idCurso);

    List<Curso> listar();
}
