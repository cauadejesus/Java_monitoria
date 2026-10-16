import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int swap = 0;
        int n = vet.length;
        boolean trocou;

        for(int i=0; i<vet.length;i++){
            System.out.println("Digite o número "+(i+1)+" : ");
            vet[i] = sc.nextInt();
        }

         for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    swap = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = swap;
                    trocou = true; 
                }
            }
            if (!trocou) {
                break;
            }
        }
        System.out.println("=============================================");
        for(int i=0; i<vet.length;i++){
            System.out.println(vet[i]);
        }
        sc.close();
    }

}