public class Ex3 {
    public static void main(String[] args){
        int[] vet = {1, 2, 3, 4, 5};
        int maior = Maior(vet);
        int menor = Menor(vet);

        /*       FORMA ALTERNATIVA SEM MÉTODO
        int maior = vet[0];
        int menor = vet[0];
        for(int i =0; i < vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        */
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }

    public static int Maior(int vet[]){
        int maior = vet[0];
        for(int i =0; i < vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        return maior;
    }
    public static int Menor(int vet[]){
        int menor = vet[0];
        for(int i =0; i < vet.length; i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        return menor;
    }
}
