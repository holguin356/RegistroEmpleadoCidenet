package com.cidenet.repository;

import com.cidenet.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    boolean existsByCorreo(String Correo);
    boolean existsByTipoIdentificacion_IdAndNumeroIdentificacion(Integer id, String numero);
// Gracias al framework Spring (JPA), ya se tienen metodos como findAll(), findById(Integer id), save, deleteById, count
}
