package com.arg_prog.portfolio.service;

import java.util.List;
import com.arg_prog.portfolio.modelo.Persona;
import com.arg_prog.portfolio.repositorio.IPersonaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    IPersonaRepositorio personaRepo;

    public Persona crearPersona(Persona persona){
        return personaRepo.save(persona);
    }

    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }

    public List<Persona> listarPersona(){
        return personaRepo.findAll();
    }

    public Persona buscarPersonaPorId(Long id){
        return personaRepo.findById(id).orElse(null);
    }

    public void modificarPersona(Persona persona){
        personaRepo.save(persona);
    }
    
}
