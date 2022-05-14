package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepositorio extends JpaRepository<Experiencia, Long>{
    
}
