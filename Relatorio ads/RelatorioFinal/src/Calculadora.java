import java.lang.Math;

public class Calculadora {


    public double soma (double numero1, double numero2) {
       return numero1 + numero2;
    }

    public double subtracao (double numero1, double numero2) {
       return numero1 - numero2;
    }

    public double multiplicação (double numero1, double numero2) {
       return numero1 * numero2;
    }

    public double divisão (double numero1, double numero2) {
       return numero1 / numero2;
    }

    public int exponencial (int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

    public double raizquadrada (double numero) {
        return (double) Math.sqrt(numero);
    }

    public double piso (double numero) {
       return (double) Math.floor(numero);
    }

    public double teto (double numero) {
       return (double) Math.ceil(numero);
    }

}