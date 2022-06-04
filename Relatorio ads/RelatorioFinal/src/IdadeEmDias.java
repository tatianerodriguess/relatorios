import java.util.Scanner;

public class IdadeEmDias {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Calculadora calcIdadeDias = new Calculadora();

        int anos, meses, dias;
        double idadeEmDias;

        System.out.println("Digite sua idade somente em anos            /Ex.: 22");
        anos = leitor.nextInt();

        System.out.println("Digite sua idade somente em meses           /Ex.: 10");
        meses = leitor.nextInt();

        System.out.println("Digite sua idade somente em dias           /Ex.: 4");
        dias = leitor.nextInt();

        idadeEmDias = calcIdadeDias.multiplicação(anos,365) + calcIdadeDias.multiplicação(meses,30) + dias;

        System.out.println("Você está com "+ idadeEmDias + " dias de vida :)");

    leitor.close();
    
    }
}
