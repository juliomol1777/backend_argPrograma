package com.arg_prog.portfolio.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tecnologias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String name;
    String progress;
    String urlLogos;
    
    public Tecnologias() {
    }

    public Tecnologias(Long id, String name, String progress, String urlLogos) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.urlLogos = urlLogos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    public String getUrlLogos() {
        return urlLogos;
    }

    public void setUrlLogos(String urlLogos) {
        this.urlLogos = urlLogos;
    }

    @Override
    public String toString() {
        return "Tecnologias [id=" + id + ", name=" + name + ", progress=" + progress 
        + ", urlLogos=" + urlLogos + "]";
    }
    

}
