package net.ejerciciodos.vehiculos.vehiculopequeño;

import net.ejerciciodos.vehiculos.Vehiculo;

public class Ciclomotor extends Vehiculo {
    protected boolean aptoAutopista;

    public Ciclomotor(String marca, double peso, double potencia, int numeroPuertas, double velocidad, boolean aptoAutopista){
        super(marca, peso, potencia, numeroPuertas, velocidad);
        this.aptoAutopista = aptoAutopista;
    }

    @Override
    public void acelerar(){
        this.velocidad += 7;
    }

    @Override
    public String toString(){
        String msg = "___________________________________";
        msg+= "\n # Tipo de vehículo: Ciclomotor";
        msg+= "\n # Marca: " + this.marca;
        msg+= "\n # Peso: " + this.peso + "kg";
        msg+= "\n # Potencia: " + this.potencia + "kW";
        msg+= "\n # Número de puertas: " + this.numeroPuertas;
        msg+= "\n # Puede ir por autopista: ";
        if (this.aptoAutopista == true){
            msg += "Sí";
        } else {
            msg += "No";
        }
        msg+= "\n # Velocidad actual: " + this.velocidad + "km/h";
        msg+= "\n ___________________________________";
        return msg;
    }

}
