public class Jogador {
    // public -> todo mundo pode acessar
    // private -> só a própria classe pode acessar
    // protected -> só a própria classe e as classes filhas podem acessar

    // método construtor, precisa ter o mesmo nome da classe

    private int num;
    public int vidas = 0;

    public Jogador(int numeroJogador) {
        // this é uma referência para o próprio objeto
        this.num = numeroJogador;
        System.out.printf("%nJogador número %d criado!%n", num);
    }

}
