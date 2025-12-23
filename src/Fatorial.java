import java.util.Scanner;

public class Fatorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + "é: " + fatorial);
    }
}

// Sistema que faz cálculos de fatoração. Muito útil para contas rápidas.