public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public String getNome() {
        return this.nome;
    }

    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getDestruido() {
        return this.destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

    public Boolean getArmamento() {
        return this.armamento;
    }

    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }

    public int getBlindagem() {
        return this.blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public void sofrerDano(int dano) {
        this.blindagem -= dano;
        if (this.blindagem <= 0) {
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }

    public void informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Destruido: " + this.destruido);
        System.out.println("Blindagem: " + this.blindagem);
        System.out.println("Armamento: " + this.armamento);
    }
}
