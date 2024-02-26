public class Animal implements SerVivo {
    public Animal() {
        System.out.println("Um animal foi criado");
    }

    public void mover() {
        System.out.println("O animal se moveu");
    }

    public void comer(int massa) {
        System.out.println("O animal comeu " + massa + " gramas de comida");
    }

    public void info() {
        System.out.println("O animal é um ser vivo");
    }
}
