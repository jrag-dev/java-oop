package figuras;

public class Perimetro {

    /* Creamos los metodos para calcular los perímetros. */

    public double calcularPerimetroCuadrado(double lado) {
        return 4*lado;
    }

    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public double calcularPerimetroCirculo(double diametro) {
        return diametro*Math.PI;
    }

    public double calcularPerimetroRectangulo(double lado1, double lado2) {
        return 2*(lado1 + lado2);
    }
}
