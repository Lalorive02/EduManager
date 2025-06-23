import java.util.*;

class ColaAtencion {
    Queue<Estudiante> cola = new LinkedList<>();
    void registrar(Estudiante e) {
        cola.offer(e);
        System.out.println("Añadido a cola: " + e.datos());
    }
    void atender() {
        Estudiante e = cola.poll();
        System.out.println(e != null ? "Atendiendo a: " + e.datos()
                                      : "Cola vacía.");
    }
}

class PilaDevoluciones {
    Stack<Libro> pila = new Stack<>();
    void devolver(Libro l) {
        pila.push(l);
        System.out.println("Devuelto: " + l.datos());
    }
    void procesar() {
        if (pila.isEmpty()) {
            System.out.println("Sin devoluciones.");
        } else {
            System.out.println("Procesando: " + pila.pop().datos());
        }
    }
    void mostrar() {
        if (pila.isEmpty()) {
            System.out.println("Sin devoluciones.");
        } else {
            System.out.println("Pila de devoluciones (LIFO):");
            for (int i = pila.size() - 1; i >= 0; i--)
                System.out.println("- " + pila.get(i).datos());
        }
    }
}

class NodoCalif {
    int valor;
    NodoCalif izq, der;
    NodoCalif(int v){ valor = v; }
}

class ArbolCalificaciones {
    NodoCalif raiz;
    void insertar(int v) { raiz = insertarRec(raiz, v); }
    NodoCalif insertarRec(NodoCalif n, int v) {
        if (n == null) return new NodoCalif(v);
        if (v < n.valor) n.izq = insertarRec(n.izq, v);
        else if (v > n.valor) n.der = insertarRec(n.der, v);
        return n;
    }
    void mostrarInOrden() {
        System.out.print("Calificaciones ordenadas: ");
        inOrdenRec(raiz);
        System.out.println();
    }
    void inOrdenRec(NodoCalif n) {
        if (n != null) {
            inOrdenRec(n.izq);
            System.out.print(n.valor + " ");
            inOrdenRec(n.der);
        }
    }
}

class MapaSalones {
    Map<String, List<String>> conexiones = new HashMap<>();
    void conectar(String a, String b) {
        conexiones.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
        conexiones.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        System.out.println("Conectado: " + a + " ↔ " + b);
    }
    void mostrarConexiones(String s) {
        List<String> v = conexiones.get(s);
        System.out.println((v == null || v.isEmpty())
            ? "Salón " + s + " sin conexiones."
            : "Conexiones de " + s + ": " + v);
    }
    void mostrarTodo() {
        if (conexiones.isEmpty()) {
            System.out.println("No hay conexiones.");
        } else {
            System.out.println("Mapa de salones:");
            for (var e : conexiones.entrySet())
                System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
