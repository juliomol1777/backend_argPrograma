package com.arg_prog.portfolio.controller;
import java.util.List;
import com.arg_prog.portfolio.modelo.Persona;
import com.arg_prog.portfolio.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class PersonaController {

    @Autowired
    PersonaService personaServicio;


    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersona() {
        return personaServicio.listarPersona();        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaServicio.crearPersona(persona);        
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaServicio.borrarPersona(id);
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaServicio.buscarPersonaPorId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Persona persona){
        personaServicio.modificarPersona(persona);
    }
    
}
