import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = 0;

        System.out.println("Bem-Vindo ao Melhor Quiz!");

        Question q1 = new Question(
                "Com quantos paus se faz uma canoa?",
                'a',
                new String[] {"Com 3 paus", "Com 2 paus", "Com 1 pau"}

        );
        Question q2 = new Question(
                "O que o sol é?",
                'b',
                new String[] {"Um planeta", "Uma estrela", "Uma bola redonda"}
        );

        Question[] questions = {q1, q2};

        for(Question q: questions) {
            System.out.println(q.getText());
            q.showAlternatives();
            char answer = scanner.next().charAt(0);
            if(q.checkAnswer(answer)) points++;
        }

        System.out.println("Sua pontuação foi: " + points);

    }
}