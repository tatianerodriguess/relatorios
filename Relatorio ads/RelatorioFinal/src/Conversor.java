import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        Calculadora calcConversor = new Calculadora();
        
        System.out.println("Digite o número em Polegadas que deseja converter para Centímetros: ");
        double valor = input.nextDouble();
        valor = calcConversor.multiplicação(valor, 2.54);
        System.out.println("O resultado é: " + valor + " centímetros");
    }
    
}
