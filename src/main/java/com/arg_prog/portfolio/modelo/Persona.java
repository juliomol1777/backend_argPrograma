package com.arg_prog.portfolio.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String fullname;
    String position;
    String ubication;
    String about;
    String image;

    public Persona() {
    }

    public Persona(Long id, String fullname, String position, String ubication, String about,
                 String image) {
        this.id = id;
        this.fullname = fullname;
        this.position = position;
        this.ubication = ubication;
        this.about = about;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Persona [about=" + about + ", fullname=" + fullname + ", id=" + id + ", image=" + image + ", position="
                + position + ", ubication=" + ubication + "]";
    }

}
