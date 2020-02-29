package com.sistemas.dao;

import com.sistemas.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoDAO extends JpaRepository<Turno,Integer> {
}
