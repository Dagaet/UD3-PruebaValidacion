package net.ejerciciodos.vehiculos.vehiculogrande;

import net.ejerciciodos.vehiculos.Vehiculo;

public class Camion extends Vehiculo {
    protected double capacidadDeCarga;
    public Camion(String marca, double peso, double potencia, int numeroPuertas, double velocidad, double capacidadDeCarga){
        super(marca, peso, potencia, numeroPuertas, velocidad);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void acelerar(){
        this.velocidad += 5;
    }

    @Override
    public String toString(){
            String msg = "___________________________________";
            msg+= "\n # Tipo de vehículo: Camión";
            msg+= "\n # Marca: " + this.marca;
            msg+= "\n # Peso: " + this.peso + "kg";
            msg+= "\n # Potencia: " + this.potencia + "kW";
            msg+= "\n # Número de puertas: " + this.numeroPuertas;
            msg+= "\n # Capacidad de carga: " + this.capacidadDeCarga;
            msg+= "\n # Velocidad actual: " + this.velocidad + "km/h";
            msg+= "\n =========================================================";
            return msg;
    }
}
