import java.util.Scanner;
public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o comprimento do lado " + (i + 1) + ": ");
            if (i == 0) {
                a = sc.nextInt();
            } else if (i == 1) {
                b = sc.nextInt();
            } else {
                c = sc.nextInt();
            }
        }
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Os comprimentos formam um triângulo.");
        } else {
            System.out.println("Os comprimentos NÃO podem formar um triângulo.");
        }
        sc.close();
    }
}
