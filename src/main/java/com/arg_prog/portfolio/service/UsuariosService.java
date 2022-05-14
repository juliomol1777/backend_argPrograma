package com.arg_prog.portfolio.service;

import java.util.List;

import com.arg_prog.portfolio.modelo.Usuarios;
import com.arg_prog.portfolio.repositorio.IUsuariosRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    
    @Autowired
    IUsuariosRepositorio usuariosRepo;

    public Usuarios crearUsuarios(Usuarios usuarios){
        return usuariosRepo.save(usuarios);
    }

    public void borrarUsuarios(Long id){
        usuariosRepo.deleteById(id);
    }

    public List<Usuarios> listarUsuarios(){
        return usuariosRepo.findAll();
    }

    public Usuarios buscarUsuariosPorId(Long id){
        return usuariosRepo.findById(id).orElse(null);
    }

    public void modificarUsuarios(Usuarios usuarios){
        usuariosRepo.save(usuarios);
    }
    
}
