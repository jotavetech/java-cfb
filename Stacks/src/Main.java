import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Pilha -> FILO

        Stack<String> carros = new Stack<>();

        carros.push("eita");
        carros.push("eita meus");
        carros.push("eita meus amigos");

        System.out.println(carros.get(2));

        for(String c: carros) {
            System.out.println(c);
        }

        System.out.println(carros.pop());
        System.out.printf(carros.pop());
    }
}