public class Main {
    public static void main(String[] args) {
        // método -> função dentro de uma classe.
        // método main é o ponto de entrada do programa.

        canal();
        msg("Olá, Mundo!", 5);

        int resultado = soma(10, 20);
        int resultado2 = soma2(10, 20, 30, 40, 50);
        Double resultado3 = soma2(10.0, 20.0, 30.0, 40.0, 50.0);

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
    // o método main é static, então todos os métodos que ele chama devem ser static também.
    // static -> método pertence à classe, não ao objeto.
    // não precisa instanciar a classe para chamar o método.
    public static void canal() {
        System.out.println("Canal Fictício");
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma2(int... numeros) {
        int soma = 0;
        for(int n : numeros) {
            soma += n;
        }
        return soma;
    }

    // sobrecarga de métodos
    public static Double soma2(Double... numeros) {
        Double soma = 0.0;
        for(Double n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static void msg(String texto, int numero) {
        for(int i = 0; i < numero; i++) {
            System.out.println(texto);
        }
    }

}

