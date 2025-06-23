import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapaSalones {
    private Map<String, List<String>> conexiones;

    public MapaSalones() {
        conexiones = new HashMap<>();
    }

    public void conectar(String a, String b) {
        conexiones.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
        conexiones.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        System.out.println("Conectado: " + a + " ↔ " + b);
    }

    public void mostrarConexiones(String salon) {
        List<String> vecinos = conexiones.get(salon);
        if (vecinos == null || vecinos.isEmpty()) {
            System.out.println("El salón " + salon + " no tiene conexiones.");
        } else {
            System.out.println("Conexiones de " + salon + ": " + vecinos);
        }
    }

    public void mostrarTodo() {
        if (conexiones.isEmpty()) {
            System.out.println("No hay conexiones registradas.");
            return;
        }
        System.out.println("Mapa de conexiones entre salones:");
        for (Map.Entry<String, List<String>> e : conexiones.entrySet()) {
            System.out.println(" " + e.getKey() + " → " + e.getValue());
        }
    }
}
