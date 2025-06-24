package com.cidenet.service;

import com.cidenet.model.Empleado;
import com.cidenet.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        // Validación de tipoIdentificación + númeroIdentificación duplicado
        boolean existeEmpleado = empleadoRepository
                .existsByTipoIdentificacion_IdAndNumeroIdentificacion(
                        empleado.getTipoIdentificacion().getId(),
                        empleado.getNumeroIdentificacion());

        if (existeEmpleado) {
            throw new IllegalArgumentException("Ya existe un empleado con ese tipo y número de identificación.");
        }

        // Generar correo y validar duplicado (manejado en la lógica de generación)
        // String correoGenerado = generarCorreo(empleado);
        // empleado.setCorreo(correoGenerado);

        // Estado y fecha
        empleado.setEstado("Activo");
        empleado.setFechaRegistro(LocalDateTime.now());

        return empleadoRepository.save(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
    //Generar correo Automaticamente con el dominio terminado en co o us, dependiendo del pais
    //En dado caso que exista tendria un contador para agregar un numero al final del apellido
    /*
    private String generarCorreo(Empleado empleado) {
        String primerNombre = limpiarTexto(empleado.getPrimerNombre());
        String primerApellido = limpiarTexto(empleado.getPrimerApellido());

        String dominio = empleado.getPais().getNombre().equalsIgnoreCase("Colombia")
                ? "@cidenet.com.co"
                : "@cidenet.com.us";

        String baseCorreo = (primerNombre + "." + primerApellido).toLowerCase();
        String correo = baseCorreo + dominio;

        int contador = 1;
        while (empleadoRepository.existsByCorreo(correo)) {
            correo = baseCorreo + "." + contador + dominio;
            contador++;
        }

        return correo;
    }
     */
    //quitar espacios, ñ por n
    private String limpiarTexto(String texto) {
        if (texto == null) return "";
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .replaceAll("Ñ", "N")
                .replaceAll("ñ", "n")
                .replaceAll("[^A-Za-z]", "");
    }
}
