import java.util.Scanner;

public class MainCalif {
    public static void main(String[] args) {
        ArbolCalificaciones arbol = new ArbolCalificaciones();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingresa una calificación (o -1 para terminar): ");
            int cal = Integer.parseInt(sc.nextLine());
            if (cal == -1) break;
            arbol.insertar(cal);
        }

        arbol.mostrarInOrden();
    }
}
