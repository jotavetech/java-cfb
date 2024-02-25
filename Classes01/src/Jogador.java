public class Jogador {
    // public -> todo mundo pode acessar
    // private -> só a própria classe pode acessar
    // protected -> só a própria classe e as classes filhas podem acessar

    // método construtor, precisa ter o mesmo nome da classe

    private final int maxVidas = 3;

    // static -> consigo acessar sem instanciar um objeto
    static boolean alerta = false;

    private int num;
    private int vidas = 0;

    static int pontosJogadores = 0;

    public Jogador(int numeroJogador) {
        // this é uma referência para o próprio objeto
        this.num = numeroJogador;
        this.vidas = 1;
        System.out.printf("%nJogador número %d criado!%n", num);
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setVidas(int vidas) {
        if(vidas > 0 && vidas <= maxVidas)
            this.vidas = vidas;
        else
            System.out.println("Número de vidas inválido!");
    }

    public void addVidas() {
        if(this.vidas < maxVidas)
            this.vidas++;
        else
            System.out.println("Número de vidas máximo atingido!");
    }

    public static void pontos() {
        pontosJogadores += 10;
    }

    public void info() {
        System.out.printf("Jogador número %d tem %d vidas%n", this.num, this.vidas);
        System.out.printf("Alerta: %s%n", alerta ? "sim" : "não");
        System.out.printf("Pontos: %d%n", pontosJogadores);
    }
}
