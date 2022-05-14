package com.arg_prog.portfolio.service;

import java.util.List;

import com.arg_prog.portfolio.modelo.Experiencia;
import com.arg_prog.portfolio.repositorio.IExperienciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {

    @Autowired
    IExperienciaRepositorio experienciaRepo;
    
    public Experiencia crearExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }

    public List<Experiencia> listarExperiencia(){

        return experienciaRepo.findAll();
    }

    public Experiencia buscarExperienciaPorId(Long id){
        return experienciaRepo.findById(id).orElse(null);
    }

    public void modificarExperiencia(Experiencia experiencia){
        experienciaRepo.save(experiencia);
    }
    
}
