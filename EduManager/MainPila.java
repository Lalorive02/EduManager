public class MainPila {
    public static void main(String[] args) {
        PilaDevoluciones pila = new PilaDevoluciones();

        Libro l1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro l2 = new Libro("Cien años de soledad", "Gabriel García Márquez");

        pila.devolver(l1);  
        pila.devolver(l2);

        System.out.println();

        pila.mostrarPila();

        System.out.println();

        pila.procesarDevolucion();  

        System.out.println();

        pila.mostrarPila();
    }
}
