/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.Date;

/**
 *
 * @author hfabi
 */
public class Alquiler {

    private int id;
    private String username;
    private Date fechaAlquiler;
    private boolean novedad;
    private String modalidad;
    private String modelo;

    public Alquiler(int id, String username, Date fechaAlquiler, boolean novedad, String modalidad) {
        this.id = id;
        this.username = username;
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.modalidad = modalidad;
    }

    public Alquiler(int id, Date fechaAlquiler, boolean novedad, String modalidad, String modelo) {
        this.id = id;    
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.modalidad = modalidad;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return modalidad;
    }

    public void setGenero(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getTitulo() {
        return modelo;
    }

    public void setTitulo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fechaAlquiler=" + fechaAlquiler + ", novedad=" + novedad + ", modalidad=" + modalidad + '}';
    }

}
