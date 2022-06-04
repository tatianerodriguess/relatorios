import java.util.Scanner;

public class PagamentoTroco{
    public static void main(String[] args) {
        Calculadora Pagartroco = new Calculadora();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("_____________________________________________");
        System.out.println("|Digite o valor da total vendido:            |");

        Double ValorTotal = input.nextDouble();
        System.out.println("|Digite o valor total pago:                  |");
        Double ValorTotalPago = input.nextDouble();
        Double Troco = Pagartroco.subtracao(ValorTotal,ValorTotalPago);
        System.out.println("|O troco é no valor de : R$" + -Troco +"             |");
        System.out.println("_____________________________________________");
    }
}