/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;


public class Peliculas {
    private int id;
    private String modelo;
    private String modalidad;
    private String marca;
    private int disponibles;
    private boolean novedad;

    public Peliculas(int id, String modelo, String modalidad, String marca, int disponibles, boolean novedad) {
        this.id = id;
        this.modelo = modelo;
        this.modalidad = modalidad;
        this.marca = marca;
        this.disponibles = disponibles;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return modelo;
    }

    public void setTitulo(String modelo) {
        this.modelo = modelo;
    }

    public String getGenero() {
        return modalidad;
    }

    public void setGenero(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getAutor() {
        return marca;
    }

    public void setAutor(String marca) {
        this.marca = marca;
    }

    public int getCopias() {
        return disponibles;
    }

    public void setCopias(int disponibles) {
        this.disponibles = disponibles;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "id=" + id + ", modelo=" + modelo + ", modalidad=" + modalidad + ", marca=" + marca + ", disponibles=" + disponibles + ", novedad=" + novedad + '}';
    }
    
    
    
}
