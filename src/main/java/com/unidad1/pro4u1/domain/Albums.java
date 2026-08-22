package com.unidad1.pro4u1.domain;

public class Albums {
    
    private String nombre;
    private String descripcion;
    private String imagenURL;

    public Albums(String nombre, String descripcion, String imagenURL) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenURL = imagenURL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }   
        
}
