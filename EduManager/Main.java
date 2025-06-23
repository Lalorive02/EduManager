import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        arrayList<Estudiante> estudiantes = new ArrayList<> ();
        Scanner sc = new Scanner(System.in);

        //acá registramos al estuadiante
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Grado (número): ");
        int g = Integer.parseInt(sc.nextLine());
        System.out.print("Grupo (letra): ");
        String gr = sc.nextLine();

        Estudiante e = new Estudiante (nom, id, g, gr);
        estudiantes.add(e);
        System.out.printIn("Estudiante registrado.");

        //mostramos la lista
        System.out.printIn("\nLista de estudiantes:");
        for (Estudiante estud : estudiantes) {
            System.out.printIn(estud.datos());
            
        }
    }
}