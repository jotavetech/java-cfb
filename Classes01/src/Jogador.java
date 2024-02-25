public class Jogador {
    // public -> todo mundo pode acessar
    // private -> só a própria classe pode acessar
    // protected -> só a própria classe e as classes filhas podem acessar

    // método construtor, precisa ter o mesmo nome da classe

    public int num = 1;

    public Jogador(int numeroJogador) {
        System.out.printf("%nJogador número %d criado!%n", numeroJogador);
    }

}
