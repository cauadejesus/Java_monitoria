import java.util.Scanner;
public class Ex3 {
    //Um record que serve como o "pacote" para as duas notas (para não ter que criar dois métodos para ler cada nota separadamente)
    public record Notas(double nota1, double nota2) {}
    //A função agora lê as duas notas e retorna o pacote
    public static Notas lerNotas(Scanner sc) {
        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        //Retorna os dois valores juntos dentro do record
        return new Notas(nota1, nota2);
    }
    public static double Media(double nota1, double nota2){
        double media = (nota1 + nota2) / 2;
        return media;
    }
    public static boolean  CasoMedia(double media){
        if(media >= 6){
            return true;
        }else{
            return false;
        }
    }
    public static void VerificadorAprovacao(boolean aprovado){
        if(aprovado){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notas notas = lerNotas(sc);
        double media = Media(notas.nota1(), notas.nota2());
        boolean aprovado = CasoMedia(media);
        VerificadorAprovacao(aprovado);
        System.out.println("A média é: " + media);
        sc.close();
    }
}