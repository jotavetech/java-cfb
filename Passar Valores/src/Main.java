public class Main {
    public static void main(String[] args) {
        // quando passo por exemplo uma array pra uma função eu passo a referencia dele.
        // no java, em tipos primitivos fazemos cópias

        int[] notas = {3,2,5,6,7,10};
        int aprovados = 0, reprovados = 0;

        checarNotas(notas, aprovados, reprovados);

        // continua 0 porque só muda la dentro da função, é uma copia, e não uma referencia ao valor
        System.out.println(aprovados + ", "+ reprovados);
    }

    public static void checarNotas(int [] notas, int aprovados, int reprovados) {
        for(int nota: notas) {
            if(nota > 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
    }
}