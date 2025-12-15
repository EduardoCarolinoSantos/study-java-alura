import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga a sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}

//* Import: Busca Apis para serem utilizadas no código. A classe Scanner é utilizado para fazer leituras daquilo que o usuário
// *digita e armazena na variável.