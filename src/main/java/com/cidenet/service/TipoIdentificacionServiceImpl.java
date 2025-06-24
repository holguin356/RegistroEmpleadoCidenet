package com.cidenet.service;

import com.cidenet.model.TipoIdentificacion;
import com.cidenet.repository.TipoIdentificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoIdentificacionServiceImpl implements TipoIdentificacionService {

    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;

    @Override
    public List<TipoIdentificacion> listarTipoIdentificaciones() {
        return tipoIdentificacionRepository.findAll();
    }
}
