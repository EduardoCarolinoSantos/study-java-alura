public class DemonstrandoValores {
    static void main() {
        double precoProduto = 2309.99;
        int quantidade = 60;

        double faturamentoTotal = quantidade * precoProduto;

        String mensagem = String.format("""
                Atualmente temos em estoque %d produtos e o valor da unidade é: R$%.2f. Sendo assim o nosso faturamento
                será de R$%.2f""", quantidade, precoProduto,faturamentoTotal);
            // %d é utilizado para números inteiros e %f para números double.
        System.out.println(mensagem);
    }
}
