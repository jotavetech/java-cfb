public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca");
        Carro c2 = new Carro("Fiesta");

        CarroCombate c3 = new CarroCombate("Tanque", 100);
        CarroCombate c4 = new CarroCombate("Tanque 2", 100);

        c1.setLigado(true);
        c1.informacoes();

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();

        c3.informacoes();


    }
}