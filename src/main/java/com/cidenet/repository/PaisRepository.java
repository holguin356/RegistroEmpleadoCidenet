package com.cidenet.repository;

import com.cidenet.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Integer> {
// Gracias al framework Spring (JPA), ya se tienen metodos como findAll(), findById(Integer id), save, deleteById, count

}
