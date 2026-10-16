import java.util.Scanner;
public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra; 
        double precoFinal;

        System.out.print("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();
        if (valorCompra >= 100.00) {
            precoFinal = valorCompra * 0.90; 
        } else {
            precoFinal = valorCompra; 
        }
        System.out.println("Preço final: R$ " + precoFinal);
        sc.close();
    }
}