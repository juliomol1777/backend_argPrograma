package com.arg_prog.portfolio.repositorio;

import java.util.List;

import com.arg_prog.portfolio.modelo.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthRepositorio extends JpaRepository <Usuarios, Long> {
    
    List<Usuarios> findByEmailAndIsEnabledTrue(String email);
}
