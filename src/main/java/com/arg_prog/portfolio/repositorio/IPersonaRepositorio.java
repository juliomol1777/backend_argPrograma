package com.arg_prog.portfolio.repositorio;

import com.arg_prog.portfolio.modelo.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * IPersonaRepositorio, le paso la entidad y el tipo de dato del id
 */

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Long>{

    
}
