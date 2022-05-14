package com.arg_prog.portfolio.controller;

import com.arg_prog.portfolio.service.EducacionService;
import java.util.List;
import com.arg_prog.portfolio.modelo.Educacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class EducacionController {

    @Autowired
    EducacionService educacionServicio;

    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> listarEducacion() {
        return educacionServicio.listarEducacion();        
    }
    
    @PostMapping("/educacion")
    @ResponseBody
    public Educacion crearEducacion(@RequestBody Educacion educacion) {
        return educacionServicio.crearEducacion(educacion);        
    }

    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionServicio.borrarEducacion(id);
    }

    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacionPorId(@PathVariable Long id){
        return educacionServicio.buscarEducacionPorId(id);
    }

    @PutMapping("/educacion")
    public void modificarEducacion(@RequestBody Educacion educacion){
        educacionServicio.modificarEducacion(educacion);
    }
    
    
}
