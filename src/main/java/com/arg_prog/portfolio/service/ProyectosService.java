package com.arg_prog.portfolio.service;

import java.util.List;

import com.arg_prog.portfolio.modelo.Proyectos;
import com.arg_prog.portfolio.repositorio.IProyectosRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {
    

    @Autowired
    IProyectosRepositorio proyectosRepo;

    public Proyectos crearProyectos(Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }

    public void borrarProyectos(Long id){
        proyectosRepo.deleteById(id);
    }

    public List<Proyectos> listarProyectos(){
        return proyectosRepo.findAll();
    }

    public Proyectos buscarProyectosPorId(Long id){
        return proyectosRepo.findById(id).orElse(null);
    }

    public void modificarProyectos(Proyectos proyectos){
        proyectosRepo.save(proyectos);
    }
    
}
