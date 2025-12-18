import java.util.Scanner;
public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner (System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota == 0) {
                System.out.println("Você não digitou nenhuma nota, mas obrigado por acessar o sistema!");
            }

            if (nota != -1) {
            mediaAvalicao += nota; // += --> Siginifa copiar o que tinha sido feito antes.
            totalDeNotas++; // A cada nota que eu somar ele acrescenta mais uma aqui.
        }
            if (mediaAvalicao > 10) {
                System.out.println("Você está digitando valores maiores do que 10,00. O programa irá parar de executar, para que não hajam diferenças.");
                break;
            }

        System.out.println("Média de avaliações " + mediaAvalicao/totalDeNotas);
    }

}

    }
