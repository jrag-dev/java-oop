package raices;

import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        boolean estado = true;
        String respuesta;
        Raices raiz;

        do {

            System.out.println("Ingrese el valor de a: ");
            a = sc.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            b = sc.nextDouble();
            System.out.println("Ingrese el valor de c: ");
            c = sc.nextDouble();

            raiz = new Raices(a, b, c);
            raiz.calcular();

            System.out.println("\n¿Desea continuar? ");
            respuesta = sc.next();

            if (!respuesta.equalsIgnoreCase("si")) {
                estado = false;
            }
        } while (estado);

    }
}
