import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Calculadora calcfatorial = new Calculadora();
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que deseja encontrar o fatorial:");
        double valor = input.nextDouble();
        double x = valor;

        if (valor == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            double fat = valor;
            while (valor > 1) {
                fat = calcfatorial.multiplicação(fat, (valor-1));
                valor--;
            }
            System.out.println("O fatorial de " + x + " é: " + fat);
            input.close();
        }
    }
}
