import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i =1; i <=10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}

// Sistema de tabuadas, digite qualquer número e obtenha o resultado dele x10.