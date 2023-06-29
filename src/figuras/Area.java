package figuras;

public class Area {
    /* Métodos para calcular el area para las diferentes figuras */

    public double calcularAreaCuadrado(double lado) {
        return lado*lado;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base*altura)/2.0;
    }

    public double calcularAreaCirculo(double diametro) {
        double radio = diametro/2.0;
        return Math.PI*(radio*radio);
    }

    public double calcularAreaRectangulo(double lado1 ,double lado2) {
        return lado1*lado2;
    }
}
