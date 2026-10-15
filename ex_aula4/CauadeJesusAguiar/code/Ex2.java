import java.util.Scanner;
public class Ex2 {
    public static double Media(double nota1, double nota2){
        double media = (nota1 + nota2) / 2;
        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = sc.nextDouble();

        System.out.printf("A média das notas %.2f e %.2f é %.2f", nota1, nota2, Media(nota1, nota2));
        sc.close();
    }
}
