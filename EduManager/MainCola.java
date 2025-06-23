import java.util.Scanner;

public class MainCola {
    public static void main(String[] args) {
        ColaAtencion cola = new ColaAtencion();
        Scanner sc = new Scanner(System.in);

        
        Estudiante e1 = new Estudiante("Ana Pérez", "A001", 2, "B");
        Estudiante e2 = new Estudiante("Luis Gómez", "A002", 3, "A");

        
        cola.registrar(e1);
        cola.registrar(e2);

        
        System.out.println("\nAtender al siguiente...");
        cola.atender();

        System.out.println("\nAtender al siguiente...");
        cola.atender();

        System.out.println("\nIntentar atender de nuevo:");
        cola.atender();
    }
}
