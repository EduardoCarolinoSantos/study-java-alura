public class CalculadorDeDescontos {
    static void main() {
        double precoOriginal = 5599.29;
        double percentualDeDesconto = 20;
        double calculoDesconto = precoOriginal * 0.20;
        double valorFinal = precoOriginal - calculoDesconto;

        String mensagem = String.format("""
                O valor original do produto era R$%.2f. Porém com o desconto aplicado o valor passa a ser R$%.2f""",precoOriginal,valorFinal);

        System.out.println(mensagem);
    }
}
