public class Main {
    public static void main(String[] args) {
        // constante
        final int SIZE = 5;

        // criando um array de 5 elementos
        int[] num = new int[SIZE];
        int[] numeros = {1, 2, 3, 4, 5};

        for(int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        for(int i = 0; i < num.length; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        int tam = 5;
        int nota = 0;

        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
        char[] respostas = new char[tam];

        respostas[0] = 'a';
        respostas[1] = 'e';
        respostas[2] = 'c';
        respostas[3] = 'd';
        respostas[4] = 'd';

        for(int i = 0; i < tam; i++) {
            if(respostas[i] == gabarito[i]) {
                nota++;
            }
        }

        System.out.println("Nota: " + nota);
        
    }
}