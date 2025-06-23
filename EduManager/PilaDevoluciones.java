import java.util.Stack;

public class PilaDevoluciones {
    private Stack<Libro> pila;

    public PilaDevoluciones() {
        pila = new Stack<>();
    }

    public void devolver(Libro libro) {
        pila.push(libro);
        System.out.println("Libro devuelto y añadido a la pila: " + libro.datos());
    }

    public Libro procesarDevolucion() {
        if (pila.isEmpty()) {
            System.out.println("No hay devoluciones para procesar.");
            return null;
        }
        Libro libro = pila.pop();
        System.out.println("Procesando devolución de: " + libro.datos());
        return libro;
    }

    public void mostrarPila() {
        if (pila.isEmpty()) {
            System.out.println("No hay libros en la pila de devoluciones.");
            return;
        }
        System.out.println("Pila de devoluciones (de lo más reciente a lo más antiguo):");
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.println("- " + pila.get(i).datos());
        }
    }
}
