import java.util.ArrayList;
import java.util.Scanner;

public class MainLibros {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Se agregan libros
        while (true) {
            System.out.print("Deseas agregar un libro? (s/n): ");
            String resp = sc.nextLine();
            if (!resp.equalsIgnoreCase("s")) break;

            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Autor (puede dejar vacío): ");
            String autor = sc.nextLine();

            libros.add(new Libro(titulo, autor));
            System.out.println("Libro agregado.\n");
        }

        // Mostramos libros
        System.out.println("\nLibros registrados:");
        if (libros.isEmpty()) {
            System.out.println("No hay libros.");
        } else {
            for (Libro l : libros) {
                System.out.println("- " + l.datos());
            }
        }
    }
}
