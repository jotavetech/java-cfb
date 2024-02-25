public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int num = 0;

        // Instanciando um objeto da classe Jogador
        Jogador j1 = new Jogador(num++);
        Jogador j2 = new Jogador(num++);
        Jogador j3 = new Jogador(num++);

        j3.addVidas();
        j3.addVidas();

        System.out.println(j3.getVidas());



    }
}