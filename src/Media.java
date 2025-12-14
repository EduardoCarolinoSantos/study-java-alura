public class Media {
    static void main() {
        double NotaMatematica = 9.5;
        double NotaIngles = 6.5;

        double Media = (NotaIngles + NotaMatematica) /2;
        // Realizando Cálculos com variáveis e formatando a String.
        String mensagem = String.format("""
                A sua nota em matemática foi: %f e a sua nota em inglês foi: %f. Sendo assim a sua média final equivale a: %f""" , NotaMatematica, NotaIngles, Media);

        System.out.println(mensagem);
    }
}
