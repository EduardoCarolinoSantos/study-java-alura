public class CelsiusParaFahrenheit {
    static void main() {
        double temperaturaCelsius = 32.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura %f Celsius é equivalente a %f", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrehnheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheitinteira é:" + temperaturaEmFahrehnheitInteira + "°F");
    }
}
