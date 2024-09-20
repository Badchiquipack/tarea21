package com.marriaga.ejemplo;

import com.marriaga.model.Cliente;
import com.marriaga.model.Empleado;
import com.marriaga.model.Gerente;

public class EjemploGerente {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Miguel", "Arriaga", "AIAM9661112", "Av 2 de abril",
                17500.0, 590000);
        System.out.println("gerente1 = " + gerente1);

        Cliente cliente1 = new Cliente("Alma", "Gómez", "AHK83A430", "Calle Matamoros");
        System.out.println("cliente1 = " + cliente1);

        Empleado empleado1 = new Empleado("Juan", "Domínguez", "JD9JNMAD0", "Calle Leona", 30000);
        System.out.println("empleado1 = " + empleado1);
    }
}
