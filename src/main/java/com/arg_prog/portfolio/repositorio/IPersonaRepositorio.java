package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * IPersonaRepositorio
 */

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Long>{

    
}
