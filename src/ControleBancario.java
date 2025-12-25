import java.util.Scanner;

public class ControleBancario {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String inicio = String.format(""" 
                Olá! Vamos iniciar o seu cadastro em nosso sistema?
                Digite o seu nome: """);
        System.out.println(inicio);
        String nome = scanner.nextLine();
        System.out.println("\nObrigado " + nome + " agora vamos para os próximos passos.");

    }
}
