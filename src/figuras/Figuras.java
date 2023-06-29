package figuras;

import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Perimetro perimetro = new Perimetro();
        Area area = new Area();
        Heron heron = new Heron();

        int opcion;

        do {
            System.out.println("\t\nMenu");
            System.out.println("1. Areas");
            System.out.println("2. Perimetros");
            System.out.println("3. Ley de Heron");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\t\nMenu de Areas");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Circulo");
                    System.out.println("3. Triángulo");
                    System.out.println("4. Rectangulo");
                    System.out.print("Ingrese una opción: ");
                    int opcionArea = sc.nextInt();

                    switch (opcionArea) {
                        case 1:
                            System.out.print("Ingrese el valor del lado del cuadrado: ");
                            double lado = sc.nextDouble();

                            double areaCuadrado = area.calcularAreaCuadrado(lado);
                            System.out.println("\nEl área del cuadrado es: " + areaCuadrado);

                            break;
                        case 2:
                            System.out.print("Ingrese el valor del diametro del circulo: ");
                            double diametro = sc.nextDouble();

                            double areaCirculo = area.calcularAreaCirculo(diametro);
                            System.out.println("\nEl área del circulo es: " + areaCirculo);
                            break;
                        case 3:
                            System.out.print("Ingrese el valor de la base del triángulo: ");
                            double base = sc.nextDouble();

                            System.out.print("Ingrese el valor de la altura del triángulo: ");
                            double altura = sc.nextDouble();

                            double areaTriangulo = area.calcularAreaTriangulo(base, altura);
                            System.out.println("\nEl área del triángulo es: " + areaTriangulo);

                            break;
                        case 4:
                            System.out.print("Ingrese el valor del lado1 del rectangulo: ");
                            double lado1 = sc.nextDouble();

                            System.out.print("Ingrese el valor del lado2 del rectangulo: ");
                            double lado2 = sc.nextDouble();

                            double areaRectangulo = area.calcularAreaRectangulo(lado1, lado2);
                            System.out.println("\nEl área del rectangulo es: " + areaRectangulo);
                            break;
                        default:
                            System.out.println("\nOpción no soportada!");
                    }

                    break;
                case 2:
                    System.out.println("\t\nMenu de Perimetros");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Circulo");
                    System.out.println("3. Triángulo");
                    System.out.println("4. Rectangulo");
                    System.out.print("Ingrese una opción: ");
                    int opcionPerimetro = sc.nextInt();

                    switch (opcionPerimetro) {
                        case 1:
                            System.out.print("Ingrese el valor del lado del cuadrado: ");
                            double lado = sc.nextDouble();

                            double perimetroCuadrado = perimetro.calcularPerimetroCuadrado(lado);
                            System.out.println("\nEl perimetro del cuadrado es: " + perimetroCuadrado);

                            break;
                        case 2:
                            System.out.print("Ingrese el valor del diametro del circulo: ");
                            double diametro = sc.nextDouble();

                            double perimetroCirculo = perimetro.calcularPerimetroCirculo(diametro);
                            System.out.println("\nEl perimetro del circulo es: " + perimetroCirculo);
                            break;
                        case 3:
                            System.out.print("Ingrese el valor del lado1 del triángulo: ");
                            double lado1 = sc.nextDouble();

                            System.out.print("Ingrese el valor del lado2 del triángulo: ");
                            double lado2 = sc.nextDouble();

                            System.out.print("Ingrese el valor del lado3 del triángulo: ");
                            double lado3 = sc.nextDouble();

                            double perimetroTriangulo = perimetro.calcularPerimetroTriangulo(lado1, lado2, lado3);
                            System.out.println("\nEl perimetro del triángulo es: " + perimetroTriangulo);

                            break;
                        case 4:
                            System.out.print("Ingrese el valor del lado1 del rectangulo: ");
                            double ladoCuadrado1 = sc.nextDouble();

                            System.out.print("Ingrese el valor del lado2 del rectangulo: ");
                            double ladoCuadrado2 = sc.nextDouble();

                            double perimetroRectangulo = perimetro.calcularPerimetroRectangulo(ladoCuadrado1, ladoCuadrado2);
                            System.out.println("\nEl perimetro del rectangulo es: " + perimetroRectangulo);
                            break;
                        default:
                            System.out.println("\nOpción no soportada!");
                    }
                    break;
                case 3:
                    System.out.println("\t\nLey de Herón");

                    System.out.print("Ingrese el valor de a: ");
                    double a = sc.nextDouble();
                    System.out.print("Ingrese el valor de b: ");
                    double b = sc.nextDouble();
                    System.out.print("Ingrese el valor de c: ");
                    double c = sc.nextDouble();

                    double resultado = heron.calcularLeyDeHeron(a, b, c);
                    System.out.println("\nLa Ley de Herón es: " + resultado);

                    break;
                case 4:
                    System.out.println("\nGood bye...");
                    break;
                default:
                    System.out.println("\nOpción no disponible.");
                    break;
            }

        } while (opcion != 4);
    }
}
