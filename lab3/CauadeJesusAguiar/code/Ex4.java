import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o número " + (i+1) + ":");
            numeros[i] = sc.nextInt();
        }
        System.out.println("=================================================================");
        for(int i = 0; i < 10; i++){
            System.out.println("O número " + (i+1) + " é: " + numeros[i]);
        }
        sc.close();
    }
}
