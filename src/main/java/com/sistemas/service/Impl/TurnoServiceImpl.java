package com.sistemas.service.Impl;

import com.sistemas.dao.ITurnoDAO;
import com.sistemas.model.Turno;
import com.sistemas.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImpl implements ITurnoService {

    @Autowired
    private ITurnoDAO dao;

    @Override
    public Turno registrar(Turno turno) {
        return dao.save(turno);
    }

    @Override
    public void modificar(Turno turno) {
        dao.save(turno);
    }

    @Override
    public void eliminar(int idTurno) {
        dao.deleteById(idTurno);
    }

    @Override
    public Turno listarId(int idTurno) {
        return dao.findById(idTurno).get();
    }

    @Override
    public List<Turno> listar() {
        return dao.findAll();
    }
}
