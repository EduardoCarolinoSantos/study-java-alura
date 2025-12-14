public class Casting {
    static void main() {
        double precoOriginalDoCarro = 39500.99;
        int desconto = 5425;

        int precoFinal = (int) (precoOriginalDoCarro) - desconto;
        double valorParcelas = (double) (precoFinal) /48;
        // Formatando Strings e aplicando o Casting.
        String mensagemFinal = String.format("""
                O valor original do carro era de R$%f, porém com o desconto de R$%d. Conseguimos chegar no valor de R$%d
                e esse valor pode ser dividido em até 48x de R$%f""",precoOriginalDoCarro,desconto,precoFinal,valorParcelas);

        System.out.println(mensagemFinal);
    }
}
