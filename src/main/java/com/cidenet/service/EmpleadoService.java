package com.cidenet.service;

import com.cidenet.model.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado guardarEmpleado (Empleado empleado);
    List<Empleado> listarEmpleados();
}
