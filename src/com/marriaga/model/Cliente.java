package com.marriaga.model;

public class Cliente extends Persona {

    private int clienteId;
    private int ultimoId;

    public Cliente(String nombre, String apellido, String rfc, String direccion) {
        super(nombre, apellido, rfc, direccion);
        this.clienteId = ++ultimoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "clienteId=" + clienteId + '\''+", " + super.toString();
    }
}
