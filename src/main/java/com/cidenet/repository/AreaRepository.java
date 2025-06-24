package com.cidenet.repository;

import com.cidenet.model.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository <Area, Integer> {
// Gracias al framework Spring (JPA), ya se tienen metodos como findAll(), findById(Integer id), save, deleteById, count

}
