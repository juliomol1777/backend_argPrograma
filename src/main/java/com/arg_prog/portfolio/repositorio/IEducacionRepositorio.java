package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepositorio extends JpaRepository<Educacion, Long>{
    
}
