import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 2, 5, 7};
        int[] numbers2 = new int[5];

        Arrays.sort(numbers); // ordena o array

        Arrays.fill(numbers2, 10); // preenche o array com o valor 10

        // copia os 5 primeiros elementos do array numbers para o array numbers2
        System.arraycopy(numbers, 0, numbers2, 0, 5);
        // array de origem, posição inicial, array de destino, posição inicial, quantidade de elementos

        System.out.println("Arrays são iguais: " + Arrays.equals(numbers, numbers2)); // compara se os arrays são iguais

        // for especial para leitura
        for (int num : numbers) {
            System.out.println(num);
        }


    }
}