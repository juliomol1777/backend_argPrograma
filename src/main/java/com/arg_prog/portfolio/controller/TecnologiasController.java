package com.arg_prog.portfolio.controller;

import java.util.List;

import com.arg_prog.portfolio.modelo.Tecnologias;
import com.arg_prog.portfolio.service.TecnologiasService;

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
public class TecnologiasController {

    @Autowired
    TecnologiasService tecnologiasServicio;

    @GetMapping("/tecnologias")
    @ResponseBody
    public List<Tecnologias> listarTecnologias() {
        return tecnologiasServicio.listarTecnologias();        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/tecnologias")
    @ResponseBody
    public Tecnologias crearTecnologias(@RequestBody Tecnologias tecnologias) {
        return tecnologiasServicio.crearTecnologias(tecnologias);        
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/tecnologias/{id}")
    public void borrarTecnologias(@PathVariable Long id){
        tecnologiasServicio.borrarTecnologias(id);
    }

    @GetMapping("/tecnologias/{id}")
    @ResponseBody
    public Tecnologias buscarTecnologiasPorId(@PathVariable Long id){
        return tecnologiasServicio.buscarTecnologiasPorId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/tecnologias")
    public void modificarTecnologias(@RequestBody Tecnologias tecnologias){
        tecnologiasServicio.modificarTecnologias(tecnologias);
    }

    
}
