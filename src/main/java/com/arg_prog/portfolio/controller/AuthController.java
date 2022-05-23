package com.arg_prog.portfolio.controller;

import com.arg_prog.portfolio.modelo.UserDto;
import com.arg_prog.portfolio.modelo.Usuarios;
import com.arg_prog.portfolio.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class AuthController {
    
    @Autowired
    AuthService authServicio;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return authServicio.isUserEnabled(userDto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuarios usuario) throws Exception {
        authServicio.crearUsuario(usuario);
    }
}
