package com.sistemas.controller;


import com.sistemas.model.Turno;
import org.springframework.hateoas.Resource;
import com.sistemas.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "/api/turnos")
public class TurnoController {

    @Autowired
    private ITurnoService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Turno>> listar() {

        List<Turno> turnos = new ArrayList<>();
        turnos = service.listar();

        return new ResponseEntity<>(turnos, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Resource<Turno> listarId(@PathVariable("id") Integer id) {
        Turno turno = new Turno();
        turno = service.listarId(id);
        Resource<Turno> resource = new Resource<Turno>(turno);
        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).listar());
        resource.add(linkTo.withRel("all_UnidadMedidas"));
        return resource;
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> registrar(@Valid @RequestBody Turno turnos) {
        service.registrar(turnos);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> actualizar(@RequestBody Turno turnos) {
        service.modificar(turnos);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
