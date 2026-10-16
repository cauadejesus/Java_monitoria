import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSegundos = 0;

        System.out.print("Digite o total de segundos: ");
        totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int restoHoras = totalSegundos % 3600;

        int minutos = restoHoras / 60;
        int segundos = restoHoras % 60;
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        sc.close();
    }
}
