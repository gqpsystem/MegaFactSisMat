package com.sistemas.service.Impl;

import com.sistemas.dao.IDocenteDAO;
import com.sistemas.model.Docente;
import com.sistemas.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements IDocenteService {

    @Autowired
    private IDocenteDAO dao;

    @Override
    public Docente registrar(Docente docente) {
        return dao.save(docente);
    }

    @Override
    public void modificar(Docente docente) {
        dao.save(docente);
    }

    @Override
    public void eliminar(int idDocente) {
        dao.deleteById(idDocente);
    }

    @Override
    public Docente listarId(int idDocente) {
        return dao.findById(idDocente).get();
    }

    @Override
    public List<Docente> listar() {
        return dao.findAll();
    }
}
