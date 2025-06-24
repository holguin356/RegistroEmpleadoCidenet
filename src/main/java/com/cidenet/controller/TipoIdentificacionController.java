package com.cidenet.controller;

import com.cidenet.model.TipoIdentificacion;
import com.cidenet.service.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-identificacion")
public class TipoIdentificacionController {

    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    @GetMapping
    public ResponseEntity<List<TipoIdentificacion>> listarTiposIdentificacion() {
        return ResponseEntity.ok(tipoIdentificacionService.listarTipoIdentificaciones());
    }
}