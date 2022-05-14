package com.arg_prog.portfolio.controller;

import java.util.List;

import com.arg_prog.portfolio.modelo.Usuarios;
import com.arg_prog.portfolio.service.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = {"http://localhost:4200/"})
public class UsuariosController {

    @Autowired
    UsuariosService usuariosServicio;

    @GetMapping("/usuarios")
    @ResponseBody
    public List<Usuarios> listarUsuarios() {
        return usuariosServicio.listarUsuarios();        
    }
    
    @PostMapping("/usuarios")
    @ResponseBody
    public Usuarios crearUsuarios(@RequestBody Usuarios usuarios) {
        return usuariosServicio.crearUsuarios(usuarios);        
    }

    @DeleteMapping("/usuarios/{id}")
    public void borrarUsuarios(@PathVariable Long id){
        usuariosServicio.borrarUsuarios(id);
    }

    @GetMapping("/usuarios/{id}")
    @ResponseBody
    public Usuarios buscarUsuariosPorId(@PathVariable Long id){
        return usuariosServicio.buscarUsuariosPorId(id);
    }

    @PutMapping("/usuarios")
    public void modificarUsuarios(@RequestBody Usuarios usuarios){
        usuariosServicio.modificarUsuarios(usuarios);
    }
    
    
}
