package com.cidenet.controller;

import com.cidenet.model.Pais;
import com.cidenet.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public ResponseEntity<List<Pais>> listarPaises() {
        return ResponseEntity.ok(paisService.listarPaises());
    }
}
