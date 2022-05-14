package com.arg_prog.portfolio.service;

import java.util.List;

import com.arg_prog.portfolio.modelo.Educacion;
import com.arg_prog.portfolio.repositorio.IEducacionRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {

    @Autowired
    IEducacionRepositorio educacionRepo;

    public Educacion crearEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }

    public List<Educacion> listarEducacion(){

        return educacionRepo.findAll();
    }

    public Educacion buscarEducacionPorId(Long id){
        return educacionRepo.findById(id).orElse(null);
    }

    public void modificarEducacion(Educacion educacion){
        educacionRepo.save(educacion);
    }
    
    
}
