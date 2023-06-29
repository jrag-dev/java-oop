package raices;

import java.text.DecimalFormat;

public class Raices {
    private double a;
    private double b;
    private double c;

    private static int numOfintentos = 0;
    DecimalFormat formato = new DecimalFormat("#.##");

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        numOfintentos++;
    }

    // Obtener raices
    private void getRaicesReales() {
        double x1 = (-b + Math.sqrt(getDescriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getDescriminante()))/(2*a);

        System.out.println("x1: " + formato.format(x1));
        System.out.println("x2: " + formato.format(x2));
    }

    // Obtener raices complejas
    private void getRaicesComplejas() {
        double xr = -b/(2*a);
        double xi = Math.sqrt(-getDescriminante())/2*a;

        System.out.println("x1: " + formato.format(xr) + " + " + formato.format(xi) + "i");
        System.out.println("x2: " + formato.format(xr) + " - " + formato.format(xi) + "i");
    }

    // Obtener raiz única
    private void getRaizUnica() {
        double x = -b/(2*a);
        System.out.println("x: " + formato.format(x));
    }

    // Obtener el descriminante
    private double getDescriminante() {
        return (b*b - 4*a*c);
    }

    private boolean tieneRaicesReales() {
        return getDescriminante() > 0;
    }

    private boolean tieneRaicesComplejas() {
        return getDescriminante() < 0;
    }

    public void calcular() {
        if (a == 0) {
            System.out.println("\nNo es una ecuación cuadratica!");
            System.out.println("Su raiz es x = " + (-b/c));
        }
        else {
            if (tieneRaicesReales()) {
                System.out.println("\nTiene dos raices reales: ");
                getRaicesReales();
            }
            else if (tieneRaicesComplejas()){
                System.out.println("\nTiene dos raices complejas: ");
                getRaicesComplejas();
            }
            else {
                System.out.println("\nTiene una raíz real: ");
                getRaizUnica();
            }
        }
    }

}
