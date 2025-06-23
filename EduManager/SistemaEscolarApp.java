import java.util.*;

public class SistemaEscolarApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        var estudiantes = new ArrayList<Estudiante>();
        var libros = new ArrayList<Libro>();
        var cola = new ColaAtencion();
        var pila = new PilaDevoluciones();
        var arbol = new ArbolCalificaciones();
        var materias = new HashMap<String, String>();
        var mapa = new MapaSalones();

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Registrar estudiante");
            System.out.println("2) Ver estudiantes");
            System.out.println("3) Agregar libro");
            System.out.println("4) Ver libros");
            System.out.println("5) Registrar atención");
            System.out.println("6) Atender estudiante");
            System.out.println("7) Registrar devolución");
            System.out.println("8) Ver pila devoluciones");
            System.out.println("9) Insertar calificación");
            System.out.println("10) Mostrar calificaciones");
            System.out.println("11) Registrar materia");
            System.out.println("12) Ver materias");
            System.out.println("13) Conectar salones");
            System.out.println("14) Ver conexiones salón");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            String opt = sc.nextLine();
            if (opt.equals("0")) { System.out.println("¡Adiós!"); break; }

            switch(opt) {
                case "1": {
                    System.out.print("Nombre: "); String nom = sc.nextLine();
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Grado: "); int g = Integer.parseInt(sc.nextLine());
                    System.out.print("Grupo: "); String gr = sc.nextLine();
                    estudiantes.add(new Estudiante(nom, id, g, gr));
                    System.out.println("Estudiante registrado."); break;
                }
                case "2": {
                    if (estudiantes.isEmpty()) System.out.println("No hay estudiantes.");
                    else estudiantes.forEach(e -> System.out.println(e.datos()));
                    break;
                }
                case "3": {
                    System.out.print("Título: "); String t = sc.nextLine();
                    System.out.print("Autor (opcional): "); String a = sc.nextLine();
                    libros.add(new Libro(t, a)); System.out.println("Libro agregado.");
                    break;
                }
                case "4": {
                    if (libros.isEmpty()) System.out.println("No hay libros.");
                    else libros.forEach(l -> System.out.println(l.datos()));
                    break;
                }
                case "5": {
                    System.out.print("ID estudiante: "); String idc = sc.nextLine();
                    estudiantes.stream()
                         .filter(e -> e.id.equals(idc))
                         .findFirst()
                         .ifPresentOrElse(cola::registrar,
                            () -> System.out.println("ID no encontrado."));
                    break;
                }
                case "6": cola.atender(); break;
                case "7": {
                    System.out.print("Título devuelto: "); String td = sc.nextLine();
                    pila.devolver(new Libro(td, ""));
                    break;
                }
                case "8": pila.mostrar(); break;
                case "9": {
                    System.out.print("Calif (int): "); int ca = Integer.parseInt(sc.nextLine());
                    arbol.insertar(ca); break;
                }
                case "10": arbol.mostrarInOrden(); break;
                case "11": {
                    System.out.print("Código materia: "); String cod = sc.nextLine();
                    System.out.print("Nombre materia: "); String nm = sc.nextLine();
                    materias.put(cod, nm);
                    System.out.println("Materia registrada.");
                    break;
                }
                case "12": {
                    if (materias.isEmpty()) System.out.println("No hay materias.");
                    else materias.forEach((c,n) -> System.out.println(c + " → " + n));
                    break;
                }
                case "13": {
                    System.out.print("Salón A: "); String sa = sc.nextLine();
                    System.out.print("Salón B: "); String sb = sc.nextLine();
                    mapa.conectar(sa, sb); break;
                }
                case "14": {
                    System.out.print("Salón: "); String s = sc.nextLine();
                    mapa.mostrarConexiones(s); break;
                }
                default: System.out.println("Opción inválida.");
            }
        }
    }
}
