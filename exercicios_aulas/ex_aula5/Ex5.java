public class Ex5 {
    public static void main(String[] args){
        int[][] mat = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        int[] soma = new int[3];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                soma[i] += mat[i][j];
            }
        }
        for(int i = 0; i < soma.length; i++){
            System.out.println(soma[i]);
        }
    }
}

