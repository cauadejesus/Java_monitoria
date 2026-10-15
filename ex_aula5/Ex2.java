public class Ex2 {
    public static void main(String[] args) {
        double[] vet = {1.0, 2.0, 3.0, 4.0, 5.0};
        double soma = Soma(vet);
        double media = Media(soma);
        System.out.println("Soma: " + media);
        
        
        /* FORMA ALTERNATIVA SEM MÉTODO
        double media = 0.0;
        for (int i = 0; i < vet.length; i++) {
            media += vet[i];
        }
        media /= vet.length;
        System.out.println("Média: "+media);
        */
    }
    public static double Soma(double vet[]){
        double soma = 0.0;
        for(int i = 0; i < vet.length; i++){
            soma += vet[i];
        }
        return soma;
    }

    public static double Media(double soma){
        double media = 0.0;
        media = soma/5;
        return media;
    }
}
