import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner (System.in);
        double mediaAvalicao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvalicao += nota; // += --> Siginifa copiar o que tinha sido feito antes.
        }

        System.out.println("Média de avaliações " + mediaAvalicao/3);
    }

}
