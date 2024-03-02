import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // funções anônimas
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        values.forEach((value) -> {
            if (value % 2 == 0) {
                par.add(value);
            } else {
                impar.add(value);
            }
        });

        System.out.println(values);
        System.out.println(par);
        System.out.println(impar);
    }
}