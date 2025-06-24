package com.cidenet.controller;

import com.cidenet.model.Area;
import com.cidenet.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping
    public ResponseEntity<List<Area>> listarAreas() {
        return ResponseEntity.ok(areaService.listarAreas());
    }
}
