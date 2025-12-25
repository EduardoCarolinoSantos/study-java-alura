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

        String tipoConta = "Corrente";
        Scanner saldoInicial = new Scanner(System.in);
        double saldoAtual = scanner.nextDouble();

        System.out.println("**********************************");
        String extratoBancario = String.format("""
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo atual: R$ %.2f
                **********************************""",nome, tipoConta, saldoAtual);
        System.out.println(extratoBancario);


    }
}
