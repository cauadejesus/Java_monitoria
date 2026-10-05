import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d:", i+1);   //System.out.println("Digite o valor"+ (i+1)+": ");
            String valor = sc.nextLine();
            double num = Double.parseDouble(valor);
            nota += num;
        }
        double media = nota/3.0;
        String[] mencao = {"II", "MI", "MM", "MS", "SS"};

        if(media < 3){
            System.out.println("Mencao: "+mencao[0]);
        }
        else if(media >= 3 && media < 4.9){
            System.out.println("Mencao: "+mencao[1]);
        }
        else if(media >= 5 && media < 6.9){
            System.out.println("Mencao: "+mencao[2]);
        }
        else if(media >= 7 && media < 8.9){
            System.out.println("Mencao: "+mencao[3]);
        }
        else if(media >= 9 && media < 10){
            System.out.println("Mencao: "+mencao[4]);
        }
        else{
            System.out.println("Mencao: Erro");
        }
        sc.close();
    }
}
