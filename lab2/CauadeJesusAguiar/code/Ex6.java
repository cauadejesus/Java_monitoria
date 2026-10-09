import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: ", i+1);
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++){
            if(numeros[i] > 100){
                System.out.printf("O valor %d é maior que 100.\n", numeros[i]);
            }
        }
        sc.close();
    }
}
