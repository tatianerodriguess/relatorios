import java.lang.Math;

public class Calculadora {


 /* declaração abaixo das funções: soma, subtração e multiplicação - Juliane */

    public static double soma (double numero1, double numero2) {
       return numero1 + numero2;
    }

    public static double subtracao (double numero1, double numero2) {
       return numero1 - numero2;
    }

    public static double multiplicação (double numero1, double numero2) {
       return numero1 * numero2;
    }

    public static double divisão (double numero1, double numero2) {
       return numero1 / numero2;
    }

    /* declaração abaixo das minhas duas funções: ex,ponencial e raíz quadrada -that */

    public static int exponencial (int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

    public static double raizquadrada (double numero) {
        return (double) Math.sqrt(numero);
    }


    /* Falta implementar: divisão, piso e teto */

}