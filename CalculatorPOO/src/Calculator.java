import java.util.Scanner;

public class Calculator {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        Numero resultado = new Numero();

        System.out.println("Digite o primeiro número: ");
        numero1.setValor(scanner.nextInt());

        System.out.println("Digite o segundo número: ");
        numero2.setValor(scanner.nextInt());

        resultado.setValor(numero1.getValor() + numero2.getValor());

        System.out.println("A soma dos números é: " + resultado.getValor());
    }
}
