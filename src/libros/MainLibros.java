package libros;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibros {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Libro libro = new Libro(100, "State Solid Physics", "Ny Luiggi", 812);
        Libro libro1 = new Libro(101, "Quantum Mechanics", "Sakurai Marcus", 521);
        Libro libro2 = new Libro(102, "Statistical Physics", "Thomas Ryder", 565);

        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        System.out.println("\nSe han ingresado: " + Libro.numOfLibros + " libros al sistema.");

        System.out.print("\nEl libro con más paginas es: ");
        System.out.print("\n----------------------------");
        System.out.print(obtenerLibroMasPaginas(libros));
        System.out.print("\n----------------------------\n");

    }

    public static Libro obtenerLibroMasPaginas(ArrayList<Libro> libros) {

        Libro libroMasPaginas = libros.get(0);
        for (Libro libro: libros) {
            if (libro.getNumOfPages() > libroMasPaginas.getNumOfPages()) {
                libroMasPaginas = libro;
            }
        }

        return libroMasPaginas;
    }
}
