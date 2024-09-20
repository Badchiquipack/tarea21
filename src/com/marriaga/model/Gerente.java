package com.marriaga.model;

public class Gerente extends Empleado {

    private double presupuesto;

    public Gerente(String nombre, String apellido, String rfc, String direccion, double remuneracion, double presupuesto) {
        super(nombre, apellido, rfc, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "presupuesto=" + presupuesto +
                ", " + super.toString();
    }
}
