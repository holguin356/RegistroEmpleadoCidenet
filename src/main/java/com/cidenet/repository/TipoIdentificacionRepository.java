package com.cidenet.repository;

import com.cidenet.model.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {
// Gracias al framework Spring (JPA), ya se tienen metodos como findAll(), findById(Integer id), save, deleteById, count
}
