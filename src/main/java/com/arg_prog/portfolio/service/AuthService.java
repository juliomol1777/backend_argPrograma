package com.arg_prog.portfolio.service;

import java.util.List;

import com.arg_prog.portfolio.modelo.UserDto;
import com.arg_prog.portfolio.modelo.Usuarios;
import com.arg_prog.portfolio.repositorio.IAuthRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Definimos una funcion para primero buscar un usuario por su email
 * si existe comparamos las contraseñas ingresadas con la de la bd
 * @author
 */

@Service
public class AuthService {

    @Autowired
    IAuthRepositorio repositorioAuth;
    
    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean isUserEnabled(UserDto userDto) {
        boolean usuarioAutenticado = false;
        List<Usuarios> usuarios = repositorioAuth.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {
            Usuarios usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword())){
                usuarioAutenticado = true;
            }
        }
        return usuarioAutenticado;
    }

    public void crearUsuario(Usuarios usuario) throws Exception{
        List<Usuarios> usuarios = repositorioAuth.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty()) {
            throw new Exception("El email ya está registrado.");
        } else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            repositorioAuth.save(usuario);
        }
    }
    
}
