package com.marriaga.model;

public class Empleado extends Persona {

    private int empleadoId;
    private double remuneracion;
    private int ultimoId;

    public Empleado(String nombre, String apellido, String rfc, String direccion, double remuneracion) {
        super(nombre, apellido, rfc, direccion);
        this.empleadoId = ++ultimoId;
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion *= ((100 + porcentaje) / 100d);
    }

    @Override
    public String toString() {
        return "empleadoId=" + empleadoId +
                ", remuneracion=" + remuneracion +
                ", " + super.toString();
    }
}
