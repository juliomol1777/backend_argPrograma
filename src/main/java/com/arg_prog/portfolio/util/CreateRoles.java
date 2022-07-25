package com.arg_prog.portfolio.util;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.arg_prog.portfolio.security.entity.Rol;
import com.arg_prog.portfolio.security.enums.RolNombre;
import com.arg_prog.portfolio.security.service.RolService;
*/
/*
 * esta clase la corro solo una vez para agregar roles a la tabla de la bd desde java
 * tambien podria agregar los roles directamente en la tabla desde phpmyadmin 
 */
/*@Component
public class CreateRoles implements CommandLineRunner{

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
    
}
*/