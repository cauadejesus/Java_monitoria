import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Objeto responsável por gerar números aleatórios.
        Random random = new Random();

        // Variável que controla se o jogador deseja continuar jogando.
        boolean jogarNovamente = true;

        // Laço principal: permite várias partidas.
        while (jogarNovamente) {

            // Gera um número aleatório entre 1 e 100.
            int numeroSecreto = random.nextInt(100) + 1;

            // Conta as tentativas do jogador.
            int tentativas = 0;

            // Guarda o palpite informado.
            int palpite = 0;

            System.out.println("\n\t\t\t\t|===============================|");
            System.out.println("\t\t\t\t|      JOGO DE ADIVINHAÇÃO      |");
            System.out.println("\t\t\t\t|===============================|");
            System.out.println("\t\t\t\t Tente adivinhar o numero secreto!");
            System.out.println("\t\t\t\t O numero esta entre 1 e 100.");
            System.out.println("\t\t\t\t O meu record foi de 4 tentativas. Boa sorte :)");

            // Laço que continua até o número ser acertado. (Enquanto o palpite for diferente do número secreto)
            while (palpite != numeroSecreto) {

                System.out.print("\nDigite seu palpite: ");

                // Verifica se foi um número inteiro.
                while (!sc.hasNextInt()) {
                    System.out.println("Entrada invalida! Digite um numero inteiro.");
                    sc.next();
                    System.out.println("\n\t\t\t\t|===============================|");
                    System.out.print("Digite seu palpite: ");
                }

                // Lê o palpite digitado.
                palpite = sc.nextInt();

                // Contador para as tentativas.
                tentativas++;

                // Verifica se o palpite está dentro do intervalo permitido. (Se o palpite for menor que 1 OU maior que 100, exibe uma mensagem de erro)
                if (palpite < 1 || palpite > 100) {
                    System.out.println("\n\t\t\t\t|===============================|");
                    System.out.println("Digite um numero entre 1 e 100!");

                } else if (palpite < numeroSecreto) {   // (Se o palpite for menor que o número secreto, exibe uma mensagem informando que o número secreto é maior)
                    System.out.println("\n\t\t\t\t|===============================|");
                    System.out.println("O numero secreto e MAIOR!");

                } else if (palpite > numeroSecreto) {   // (Se o palpite for maior que o número secreto, exibe uma mensagem informando que o número secreto é menor)
                    System.out.println("\n\t\t\t\t|===============================|");
                    System.out.println("O numero secreto e MENOR!");

                } else {    // (Se o palpite for igual ao número secreto, exibe uma mensagem de parabéns e informa o número secreto e o total de tentativas)
                    System.out.println("\n\t\t\t\t|===============================|");
                    System.out.println("\nPARABENS! VOCE ACERTOU!");
                    System.out.println("Numero secreto: " + numeroSecreto);
                    System.out.println("Total de tentativas: " + tentativas);

                }
            }

            // Pergunta se o jogador deseja iniciar outra partida.
            System.out.println("\n\t\t\t\t|===============================|");
            System.out.print("\nDeseja jogar novamente? (s/n): ");
            String resposta = sc.next();

            // Continua somente se a resposta for "s".  // O operador equalsIgnoreCase() compara duas strings ignorando diferenças entre maiúsculas e minúsculas)
            jogarNovamente = resposta.equalsIgnoreCase("s");
        }
        System.out.println("\nObrigado por jogar! Ate a proxima.");

        sc.close();
    }
}