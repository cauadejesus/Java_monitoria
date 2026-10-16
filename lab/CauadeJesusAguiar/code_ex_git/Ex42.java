import java.util.Scanner;
public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trocoCentavos = 0; 
        System.out.print("Digite o valor do troco em centavos: ");
        trocoCentavos = sc.nextInt();


        int m100 = trocoCentavos / 100; 
        trocoCentavos = trocoCentavos % 100;

        int m50 = trocoCentavos / 50;   
        trocoCentavos = trocoCentavos % 50;

        int m25 = trocoCentavos / 25;   
        trocoCentavos = trocoCentavos % 25;

        int m10 = trocoCentavos / 10;  
        trocoCentavos = trocoCentavos % 10;

        int m05 = trocoCentavos / 5;   

        int m01 = trocoCentavos % 5;   

        System.out.println("Moedas de R$ 1,00: " + m100);
        System.out.println("Moedas de R$ 0,50: " + m50);
        System.out.println("Moedas de R$ 0,25: " + m25);
        System.out.println("Moedas de R$ 0,10: " + m10);
        System.out.println("Moedas de R$ 0,05: " + m05);
        System.out.println("Moedas de R$ 0,01: " + m01);
        sc.close();
    }
}
