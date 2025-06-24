package com.cidenet.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmpleadoResponseDto {
    private Integer id;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String otrosNombres;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String correo;
    private String pais;
    private String area;
    private LocalDate fechaIngreso;
    private String estado;
    private LocalDateTime fechaRegistro;

    // Getters y Setters

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }

    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    public String getOtrosNombres() { return otrosNombres; }
    public void setOtrosNombres(String otrosNombres) { this.otrosNombres = otrosNombres; }

    public String getTipoIdentificacion() { return tipoIdentificacion; }
    public void setTipoIdentificacion(String tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }

    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
