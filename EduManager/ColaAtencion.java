import java.util.LinkedList;
import java.util.Queue;

public class ColaAtencion {
    private Queue<Estudiante> cola;

    public ColaAtencion() {
        cola = new LinkedList<>();
    }

    public void registrar(Estudiante e) {
        cola.offer(e); 
        System.out.println("Estudiante registrado en la cola: " + e.datos());
    }

    public Estudiante atender() {
        Estudiante atendido = cola.poll(); 
        if (atendido != null) {
            System.out.println("Atendiendo a: " + atendido.datos());
        } else {
            System.out.println("No hay estudiantes en la cola.");
        }
        return atendido;
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
