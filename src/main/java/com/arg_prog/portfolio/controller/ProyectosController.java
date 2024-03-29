package com.arg_prog.portfolio.controller;

import java.util.List;

import com.arg_prog.portfolio.modelo.Proyectos;
import com.arg_prog.portfolio.service.ProyectosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin(origins = "*")
public class ProyectosController {

    @Autowired
    ProyectosService proyectosServicio;

    @GetMapping("/proyectos")
    @ResponseBody
    public List<Proyectos> listarProyectos() {
        return proyectosServicio.listarProyectos();        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyectos")
    @ResponseBody
    public Proyectos crearProyectos(@RequestBody Proyectos proyectos) {
        return proyectosServicio.crearProyectos(proyectos);        
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyectos/{id}")
    public void borrarProyectos(@PathVariable Long id){
        proyectosServicio.borrarProyectos(id);
    }

    @GetMapping("/proyectos/{id}")
    @ResponseBody
    public Proyectos buscarProyectosPorId(@PathVariable Long id){
        return proyectosServicio.buscarProyectosPorId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyectos")
    public void modificarProyectos(@RequestBody Proyectos proyectos){
        proyectosServicio.modificarProyectos(proyectos);
    }
    
}
