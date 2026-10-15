public class Ex4 {
    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4, 5};
        int soma = Soma(vet);
        System.out.println("Soma: " + soma);
    }

    public static int Soma(int[] vet) {
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }
}
