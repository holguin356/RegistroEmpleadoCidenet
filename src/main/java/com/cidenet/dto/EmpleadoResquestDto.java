package com.cidenet.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class EmpleadoResquestDto {

    @NotBlank(message = "El primer apellido es obligatorio")
    @Size(max = 20, message = "El primer apellido contiene máximo 20 caracteres")
    @Pattern(regexp = "^[A-Z]{1,20}$", message = "El primer apellido debe contener solo letras mayúsculas sin acentos ni ñ")
    private String primerApellido;

    @NotBlank(message = "El segundo apellido es obligatorio")
    @Size(max = 20, message = "El segundo apellido debe tener máximo 20 caracteres")
    @Pattern(regexp = "^[A-Z]{1,20}$", message = "El segundo apellido debe contener solo letras mayúsculas sin acentos ni ñ")
    private String segundoApellido;

    @NotBlank(message = "El primer nombre es obligatorio")
    @Size(max = 20, message = "El primer nombre debe tener máximo 20 caracteres")
    @Pattern(regexp = "^[A-Z]{1,20}$", message = "El primer nombre debe contener solo letras mayúsculas sin acentos ni ñ")
    private String primerNombre;

    @Size(max = 50, message = "Los otros nombres deben tener máximo 50 caracteres")
    @Pattern(regexp = "^[A-Z ]*$", message = "Los otros nombres deben contener solo letras mayúsculas sin acentos ni ñ, y espacios")
    private String otrosNombres;

    @NotBlank(message = "El número de identificación es obligatorio")
    @Size(max = 20, message = "El número de identificación debe tener máximo 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z0-9\\-]+$", message = "El número de identificación solo puede contener letras, números y guiones")
    private String numeroIdentificacion;

    //private String correo;

    @NotNull(message = "La fecha de ingreso es obligatoria")
    @PastOrPresent(message = "La fecha de ingreso no puede ser futura")
    private LocalDate fechaIngreso;

    @NotNull(message = "El tipo de identificación es obligatorio")
    private Integer tipoIdentificacionId;

    @NotNull(message = "El país es obligatorio")
    private Integer paisId;

    @NotNull(message = "El área es obligatoria")
    private Integer areaId;
    // Getters y Setters

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getOtrosNombres() {
        return otrosNombres;
    }

    public void setOtrosNombres(String otrosNombres) {
        this.otrosNombres = otrosNombres;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
/*
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
 */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getTipoIdentificacionId() {
        return tipoIdentificacionId;
    }

    public void setTipoIdentificacionId(Integer tipoIdentificacionId) {
        this.tipoIdentificacionId = tipoIdentificacionId;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}
