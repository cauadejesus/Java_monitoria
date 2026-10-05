import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("É maior de idade");
        }
        else if(idade < 18 && idade > 0){
            System.out.println("Menor de idade");
        }
        else{
            System.out.println("Erro");
        }
        sc.close();
    }
}