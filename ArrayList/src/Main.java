import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>  numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(1);
        numeros.add(3);

        carros.add("Gurgel Padrão");
        carros.add("Gol Bolinha");
        carros.add("Gol Quadrado");
        carros.add(1, "Argo");

        numeros.forEach((integer -> {
            System.out.println(integer);
        }));

        carros.forEach(System.out::println);

    }
}