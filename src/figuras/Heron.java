package figuras;

public class Heron {
    /* Creamos el método para calcular la ley de Heron */

    public double calcularLeyDeHeron(double a, double b, double c) {
        double p = (a + b + c)/2.0;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
}
