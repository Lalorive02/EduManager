import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMaterias {
    public static void main(String[] args) {
        Map<String, String> materias = new HashMap<>();
        Scanner sc = new Scanner(System.in);

    
        while (true) {
            System.out.print("¿Deseas registrar una materia? (s/n): ");
            String resp = sc.nextLine();
            if (!resp.equalsIgnoreCase("s")) break;

            System.out.print("Código de materia: ");
            String codigo = sc.nextLine().trim();
            System.out.print("Nombre de materia: ");
            String nombre = sc.nextLine().trim();

            materias.put(codigo, nombre);
            System.out.println("Materia registrada.\n");
        }

        System.out.println("\nMaterias registradas:");
        if (materias.isEmpty()) {
            System.out.println("No hay materias.");
        } else {
            for (Map.Entry<String, String> entry : materias.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        System.out.print("\nConsulta un código para ver su nombre (o deja vacío): ");
        String consulta = sc.nextLine().trim();
        if (!consulta.isEmpty()) {
            String mat = materias.get(consulta);
            if (mat != null) {
                System.out.println("Código " + consulta + ": " + mat);
            } else {
                System.out.println("Código no encontrado.");
            }
        }
    }
}
