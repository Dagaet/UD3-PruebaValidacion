package net.ejerciciodos;

import net.ejerciciodos.vehiculos.vehiculogrande.Camion;
import net.ejerciciodos.vehiculos.vehiculopequeño.Ciclomotor;

public class EjercicioDosMain {
    public static void main(String[] args) {
        Camion camion = new Camion("Mercedes", 2300, 5000, 4, 30, 4000);
        Ciclomotor ciclomotor = new Ciclomotor("Honda", 300, 4000, 3, 40, true);
        //Test 1
        System.out.println(camion.toString());
        camion.acelerar();
        System.out.println(camion.toString());
        //Test 2
        System.out.println(ciclomotor.toString());
        ciclomotor.acelerar();
        System.out.println(ciclomotor.toString());
    }
}
