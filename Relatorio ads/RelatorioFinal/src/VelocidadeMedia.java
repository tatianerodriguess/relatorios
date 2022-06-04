import java.util.Scanner;

public class VelocidadeMedia{
    public static void main(String[] args) {
        Calculadora VeloMedia = new Calculadora();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Para Calcular a velocidade média, siga os passos abaixo:");
        System.out.println("Informe a Distancia inicial em metros: ");
        Double Dinicial = input.nextDouble();
        System.out.println("Informe a Distancia Final em metros: ");
        Double Dfinal = input.nextDouble();
        System.out.println("Informe o Tempo Inicial em segundos: ");
        Double Tinicial = input.nextDouble();
        System.out.println("Informe o Tempo Final em segundos:");
        Double Tfinal = input.nextDouble();
        Double A = Dfinal-Dinicial;
        Double B = Tfinal-Tinicial;

        System.out.println("A velocidade média é: "+ VeloMedia.divisão(A,B) + "M/s")  ;
    }
}