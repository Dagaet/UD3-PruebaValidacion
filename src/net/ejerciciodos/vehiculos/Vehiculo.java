package net.ejerciciodos.vehiculos;

public class Vehiculo {
    protected String marca;
    protected double peso;
    protected double potencia;
    protected int numeroPuertas;
    protected double velocidad;

    public Vehiculo(String marca, double peso, double potencia, int numeroPuertas, double velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(){
        this.velocidad += 10;
    }

}
