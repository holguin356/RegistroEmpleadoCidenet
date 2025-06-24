package com.cidenet.controller;

import com.cidenet.dto.EmpleadoResquestDto;
import com.cidenet.dto.EmpleadoResponseDto;
import com.cidenet.mapper.EmpleadoMapper;
import com.cidenet.model.Empleado;
import com.cidenet.service.EmpleadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<EmpleadoResponseDto> guardar(@Valid @RequestBody EmpleadoResquestDto empleadoDto) {
        Empleado empleado = EmpleadoMapper.toEntity(empleadoDto);
        Empleado guardado = empleadoService.guardarEmpleado(empleado);
        EmpleadoResponseDto respuesta = EmpleadoMapper.toDto(guardado);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpleadoResponseDto>> listar() {
        List<Empleado> empleados = empleadoService.listarEmpleados();
        List<EmpleadoResponseDto> dtos = empleados.stream()
                .map(EmpleadoMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}


