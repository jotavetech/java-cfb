import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(3);

        try {
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index não existe!");
        }
    }
}