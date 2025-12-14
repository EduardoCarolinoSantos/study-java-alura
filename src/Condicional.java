public class Condicional {
    static void main() {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        //Trabalhando com condições e operadores lógicos.

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        // == Utilizado para comparar igualdade.
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado, aproveite!");
        } else {
            System.out.println("Deve realizar a assinatura do plano plus");
        }
    }
}
