
import java.util.Scanner;

public class CalcularAreaRetangulo {

    public static void main(String[]args){

        double base, altura;
            
        Calculadora totalAreaCalculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite a base do retângulo: ");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        altura = entrada.nextDouble();

        double resultado = totalAreaCalculadora.multiplicação(base, altura);
        

        System.out.println("Sua área é: "+ resultado);

        entrada.close();

    }
  
}
