package com.arg_prog.portfolio.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.arg_prog.portfolio.security.entity.Usuario;
import com.arg_prog.portfolio.security.entity.UsuarioPrincipal;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    /*
     * esta clase media entre los datos del user de la bd y el usuario principal que retorna
     */
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}
