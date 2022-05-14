package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Tecnologias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITecnologiasRepositorio extends JpaRepository<Tecnologias, Long>{
    
}
