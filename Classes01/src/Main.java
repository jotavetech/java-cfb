public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int num = 0;

        System.out.printf("¨%nAlerta:%s", Jogador.alerta ? "sim" : "não");

        // Instanciando um objeto da classe Jogador
        Jogador j1 = new Jogador(num++);
        Jogador j2 = new Jogador(num++);
        Jogador j3 = new Jogador(num++);

        j3.addVidas();
        j3.addVidas();

        System.out.println(j3.getVidas());

        Jogador.alerta = true;
        Jogador.pontos();
        Jogador.pontos();
        Jogador.pontos();

        j1.info();
        j2.info();
        j3.info();



    }
}