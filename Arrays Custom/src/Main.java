public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Girafa", 10);
        Animal a2 = new Animal("Leão", 15);

        final int animalsLength = 2;

        Animal[] animais = {a1, a2};
        Animal[] animais2 = new Animal[animalsLength];

        animais2[0] = a1;
        animais2[1] = a2;

        for(Animal a: animais) {
            System.out.println(a.nome + " - " + a.idade);
        }
    }
}