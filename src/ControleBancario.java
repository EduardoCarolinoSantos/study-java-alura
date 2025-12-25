import java.util.Scanner;

public class ControleBancario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Olá! Vamos iniciar o seu cadastro em nosso sistema?
                Digite o seu nome:
                """);

        String nome = scanner.nextLine();
        System.out.println("\nObrigado " + nome + ", agora vamos para os próximos passos.");

        System.out.print("Digite o saldo inicial: ");
        double saldoAtual = scanner.nextDouble();

        String tipoConta = "Corrente";

        System.out.println("**********************************");
        System.out.printf("""
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo atual: R$ %.2f
                **********************************
                """, nome, tipoConta, saldoAtual);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("""
                    ** Digite sua opção **
                    1 - Consultar saldo
                    2 - Pix
                    3 - Receber valor
                    4 - Sair
                    """);

            opcao = scanner.nextInt();
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
