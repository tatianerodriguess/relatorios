import java.util.Scanner;

public class CalculoIMC {
       
    public static void main(String[] args) {

        Calculadora calculadoraimc = new Calculadora();
        
        Scanner input = new Scanner(System.in);

        System.out.println("_____________________________________________");
        System.out.println("|    Digite seu peso:       /Ex.: 65,5       |");  
        double peso = input.nextDouble();
        System.out.println("|    Digite sua altura:     /Ex.: 1,68       |");
        double altura = input.nextDouble();
    
        double imc = calculadoraimc.divisão(peso , calculadoraimc.multiplicação(altura, altura));
    
            System.out.println("|Seu IMC é: " + imc + "               |");
        System.out.println("_____________________________________________");
        }
        
}
