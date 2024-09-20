package com.marriaga.model;

public class Persona {

    private String nombre;
    private String apellido;
    private String rfc;
    private String direccion;

    public Persona(String nombre, String apellido, String rfc, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rfc = rfc;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRfc() {
        return rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rfc='" + rfc + '\'' +
                ", direccion='" + direccion + '\'';
    }
}
