package com.cidenet.mapper;

import com.cidenet.dto.EmpleadoResquestDto;
import com.cidenet.dto.EmpleadoResponseDto;
import com.cidenet.model.Area;
import com.cidenet.model.Empleado;
import com.cidenet.model.Pais;
import com.cidenet.model.TipoIdentificacion;

public class EmpleadoMapper {

    public static EmpleadoResponseDto toDto(Empleado empleado) {
        EmpleadoResponseDto dto = new EmpleadoResponseDto();
        dto.setId(empleado.getId());
        dto.setPrimerApellido(empleado.getPrimerApellido());
        dto.setSegundoApellido(empleado.getSegundoApellido());
        dto.setPrimerNombre(empleado.getPrimerNombre());
        dto.setOtrosNombres(empleado.getOtrosNombres());
        dto.setTipoIdentificacion(empleado.getTipoIdentificacion().getNombre());
        dto.setNumeroIdentificacion(empleado.getNumeroIdentificacion());
        dto.setCorreo(empleado.getCorreo());
        dto.setPais(empleado.getPais().getNombre());
        dto.setArea(empleado.getArea().getNombre());
        dto.setFechaIngreso(empleado.getFechaIngreso());
        dto.setEstado(empleado.getEstado());
        dto.setFechaRegistro(empleado.getFechaRegistro());
        return dto;
    }
    public static Empleado toEntity(EmpleadoResquestDto dto) {
        Empleado empleado = new Empleado();
        empleado.setPrimerApellido(dto.getPrimerApellido());
        empleado.setSegundoApellido(dto.getSegundoApellido());
        empleado.setPrimerNombre(dto.getPrimerNombre());
        empleado.setOtrosNombres(dto.getOtrosNombres());
        empleado.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        //empleado.setCorreo(dto.getCorreo());
        empleado.setFechaIngreso(dto.getFechaIngreso());

        // Relacionar entidades con solo el ID
        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();
        tipoIdentificacion.setId(dto.getTipoIdentificacionId());
        empleado.setTipoIdentificacion(tipoIdentificacion);

        Pais pais = new Pais();
        pais.setId(dto.getPaisId());
        empleado.setPais(pais);

        Area area = new Area();
        area.setId(dto.getAreaId());
        empleado.setArea(area);

        return empleado;
    }
}
