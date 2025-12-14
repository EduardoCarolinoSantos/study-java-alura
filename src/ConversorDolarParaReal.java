public class ConversorDolarParaReal {
    static void main() {
        double valorEmDolares = 1 * 5.42;
        int quantidadeDeDolares = 2;
        double conversorDeMoedas = valorEmDolares * quantidadeDeDolares;

        String mensagem = String.format("Atualmente dois doláres custam R$%f",conversorDeMoedas);

        System.out.println(mensagem);

    }
}
