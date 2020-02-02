package com.sistemas.controller;

import com.sistemas.model.Curso;
import com.sistemas.model.Docente;
import com.sistemas.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/docentes")
public class DocenteController {

    @Autowired
    private IDocenteService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Docente>> listar() {

        List<Docente> docentes = new ArrayList<>();
        docentes = service.listar();

        return new ResponseEntity<>(docentes, HttpStatus.OK);
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> registrar(@Valid @RequestBody Docente docentes) {
        service.registrar(docentes);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> actualizar(@RequestBody Docente docentes) {
        service.modificar(docentes);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
