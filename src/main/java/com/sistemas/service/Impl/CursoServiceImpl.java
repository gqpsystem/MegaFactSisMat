package com.sistemas.service.Impl;

import com.sistemas.dao.ICursoDAO;
import com.sistemas.model.Curso;
import com.sistemas.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private ICursoDAO dao;

    @Override
    public Curso registrar(Curso curso) {
        return dao.save(curso);
    }

    @Override
    public void modificar(Curso curso) {
        dao.save(curso);
    }

    @Override
    public void eliminar(int idCurso) {
        dao.deleteById(idCurso);
    }

    @Override
    public Curso listarId(int idCurso) {
        return dao.findById(idCurso).get();
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }
}
