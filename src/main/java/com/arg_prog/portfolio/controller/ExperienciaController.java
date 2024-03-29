package com.arg_prog.portfolio.controller;

import java.util.List;

import com.arg_prog.portfolio.modelo.Experiencia;
import com.arg_prog.portfolio.service.ExperienciaService;

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
public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaServicio;

    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> listarExperiencia() {
        return experienciaServicio.listarExperiencia();        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia")
    @ResponseBody
    public Experiencia crearExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaServicio.crearExperiencia(experiencia);        
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServicio.borrarExperiencia(id);
    }

    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia buscarExperienciaPorId(@PathVariable Long id){
        return experienciaServicio.buscarExperienciaPorId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencia")
    public void modificarExperiencia(@RequestBody Experiencia experiencia){
        experienciaServicio.modificarExperiencia(experiencia);
    }
    
    
}
