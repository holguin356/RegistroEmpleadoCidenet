package com.cidenet.service;

import com.cidenet.model.Pais;
import com.cidenet.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listarPaises() {
        return paisRepository.findAll();
    }
}
