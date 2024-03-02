import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // FIFO

        Queue<String> queue = new LinkedList<>();

        queue.add("oi");
        queue.add("meus");
        queue.add("amigo");

        System.out.println(queue.poll()); // topo da pilha, remove
    }
}