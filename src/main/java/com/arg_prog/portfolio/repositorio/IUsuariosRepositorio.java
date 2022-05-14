package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepositorio extends JpaRepository<Usuarios, Long>{
    
}
