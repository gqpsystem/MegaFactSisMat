package com.sistemas.controller;

import com.sistemas.model.Curso;
import com.sistemas.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/cursos")
public class CursoController {

    @Autowired
    private ICursoService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Curso>> listar() {
        List<Curso> cursos = new ArrayList<>();
        cursos = service.listar();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

}
