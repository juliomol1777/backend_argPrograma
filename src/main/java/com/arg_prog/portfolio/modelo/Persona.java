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
    String image_background;
    String email;
    String urlIn;
    String urlGithub;


    public Persona() {
    }


    public Persona(Long id, String fullname, String position, String ubication, String about, String image,
            String image_background, String email, String urlIn, String urlGithub) {
        this.id = id;
        this.fullname = fullname;
        this.position = position;
        this.ubication = ubication;
        this.about = about;
        this.image = image;
        this.image_background = image_background;
        this.email = email;
        this.urlIn = urlIn;
        this.urlGithub = urlGithub;
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


    public String getImage_background() {
        return image_background;
    }


    public void setImage_background(String image_background) {
        this.image_background = image_background;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getUrlIn() {
        return urlIn;
    }


    public void setUrlIn(String urlIn) {
        this.urlIn = urlIn;
    }

    public String getUrlGithub() {
        return urlGithub;
    }


    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }


    @Override
    public String toString() {
        return "Persona [about=" + about + ", email=" + email + ", fullname=" + fullname + ", id=" + id + ", image="
                + image + ", image_background=" + image_background + ", position=" + position + ", ubication="
                + ubication + ", urlGithub=" + urlGithub + ", urlIn=" + urlIn + "]";
    }
       
}
