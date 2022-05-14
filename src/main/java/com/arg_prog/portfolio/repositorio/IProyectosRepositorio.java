package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Proyectos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepositorio extends JpaRepository<Proyectos, Long>{
    
}
