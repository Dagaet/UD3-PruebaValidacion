package net.ejerciciouno;

import net.ejerciciouno.calculador.Calculadora;

import java.util.Scanner;

public class EjercicioUnoMain {
    public static void main(String[] args) {
        final Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el numero con el que operar: ");
        int valorDeN = teclado.nextInt();
        if (valorDeN >0){
            System.out.println("El factorial de " + valorDeN + " es: " + Calculadora.factorialDeN(valorDeN));
            System.out.println("La media de " + valorDeN + " es: " + Calculadora.mediaHastaN(valorDeN));
            System.out.println("La sucesión de Fibonacci de " + valorDeN + " es: " + Calculadora.obtererPasosFibonacci(valorDeN));
        }else {
            System.out.println("No ha escrito el número adecuado, ejecute de nuevo el programa");
        }
    }
}
