package com.arg_prog.portfolio.service;

import java.util.List;

import com.arg_prog.portfolio.modelo.Tecnologias;
import com.arg_prog.portfolio.repositorio.ITecnologiasRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiasService {
    
    @Autowired
    ITecnologiasRepositorio tecnologiasRepo;

    public Tecnologias crearTecnologias(Tecnologias tecnologias){
        return tecnologiasRepo.save(tecnologias);
    }

    public void borrarTecnologias(Long id){
        tecnologiasRepo.deleteById(id);
    }

    public List<Tecnologias> listarTecnologias(){
        return tecnologiasRepo.findAll();
    }

    public Tecnologias buscarTecnologiasPorId(Long id){
        return tecnologiasRepo.findById(id).orElse(null);
    }

    public void modificarTecnologias(Tecnologias tecnologias){
        tecnologiasRepo.save(tecnologias);
    }
    
}
