import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if(valor % 3 == 0 && valor % 5 == 0){
            System.out.println("Esse número é divisível por 3 e 5.");
        }
        else{
            System.out.println("Esse número não é divisível por 3 e 5.");
        }
        sc.close();
    }
}
