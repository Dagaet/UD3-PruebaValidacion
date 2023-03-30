package net.ejerciciouno.calculador;

public class Calculadora {
    public static int factorialDeN(int valorDeN){
        int factorial = 1;
        for (int i = 1; i < valorDeN; i++) {
            factorial += i * factorial;
        }
        return factorial;
    }
    public static int mediaHastaN(int valorDeN){
        int media = 0;
        for (int i = 0; i <= valorDeN; i++) {
            media += i;
        }
        return media/valorDeN;
    }
    public static int obtererPasosFibonacci(int valorDeN){
        int valor1=0,valor2=1,valor3;
        if (valorDeN == 0){
            return valor1;
        }
        for (int i = 2; i <= valorDeN; i++) {
            valor3 = valor1 + valor2;
            valor1 = valor2;
            valor2 = valor3;
            System.out.print(valor2 + ", ");
        }
        System.out.println();
        return valor2;
    }
}
