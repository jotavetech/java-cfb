public class Main {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 5;

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] n : matriz) {
            for (int m : n) {
                System.out.printf("%2d ", m);
            }
            System.out.println();
        }


    }

}