import java.util.Scanner;

public class CalcularMedia {
    
    public static void main(String[]args){

        double nota1, nota2, nota3, media;

        Calculadora mediaAluno = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextDouble();

        media = mediaAluno.divisão(nota1 + nota2 + nota3, 3);


        System.out.println("Sua média final é: "+ media);

        entrada.close();

    }

}
