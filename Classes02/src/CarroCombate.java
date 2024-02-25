public class CarroCombate extends Carro{
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qtdArmamento;

    public CarroCombate(String nome, int blindagem) {
        // super > chama o construtor da classe pai
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtdArmamento = MAX_ARMAMENTO;
    }

    public int getQtdArmamento() {
        return this.qtdArmamento;
    }

    public void setQtdArmamento(int qtdArmamento) {
        this.qtdArmamento -= qtdArmamento;
    }

    public void atirar() {
        if(this.qtdArmamento > MIN_ARMAMENTO) {
            setQtdArmamento(1);
        } else {
            System.out.println("Sem munição");
        }
    }

    public void informacoes() {
        super.informacoes();
        System.out.println("Quantidade de armamento: " + this.qtdArmamento);
    }

}
