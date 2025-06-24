package com.cidenet.service;

import com.cidenet.model.Area;
import com.cidenet.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> listarAreas() {
        return areaRepository.findAll();
    }
}
