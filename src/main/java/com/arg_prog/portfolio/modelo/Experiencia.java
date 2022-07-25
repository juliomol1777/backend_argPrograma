package com.arg_prog.portfolio.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String position;
    String company;
    String start;
    String end;
    String time;
    String mode;
    String place;
    String image;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String position, String company, String start, String end, String time, String mode,
            String place, String image) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.start = start;
        this.end = end;
        this.time = time;
        this.mode = mode;
        this.place = place;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Experiencia [company=" + company + ", end=" + end + ", id=" + id + ", image=" + image + ", mode=" + mode
                + ", place=" + place + ", position=" + position + ", start=" + start + ", time=" + time + "]";
    }

}
