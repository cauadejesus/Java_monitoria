import java.util.Scanner;
public class Ex1 {
    public static double Dobro(double num){
        double dobrado = num * 2;
        return dobrado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 0.0;

        System.out.println("Digite um número: ");
        num = sc.nextDouble();
        System.out.printf("O dobro de %.2f é %.2f", num, Dobro(num));
        sc.close();
    }
}