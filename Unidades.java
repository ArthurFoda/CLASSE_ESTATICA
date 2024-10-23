public class ConversorUnidades {

    
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371;
    }


    public static double gramasParaLibras(double gramas) {
        return gramas * 0.00220462;
    }
}

public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.0; 
        double distanciaQuilometros = 100.0; 
        double massaGramas = 5000.0; 

        
        double temperaturaFahrenheit = ConversorUnidades.celsiusParaFahrenheit(temperaturaCelsius);
        double distanciaMilhas = ConversorUnidades.quilometrosParaMilhas(distanciaQuilometros);
        double massaLibras = ConversorUnidades.gramasParaLibras(massaGramas);

        
        System.out.printf("%.2f°C = %.2f°F%n", temperaturaCelsius, temperaturaFahrenheit);
        System.out.printf("%.2f km = %.2f milhas%n", distanciaQuilometros, distanciaMilhas);
        System.out.printf("%.2f g = %.2f lbs%n", massaGramas, massaLibras);
    }
}

