package com.sistemas.dao;

import com.sistemas.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteDAO extends JpaRepository<Docente,Integer> {
}
