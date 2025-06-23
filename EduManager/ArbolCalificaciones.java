public class ArbolCalificaciones {
    NodoCalif raiz;

    public ArbolCalificaciones() {
        raiz = null;
    }

    public void insertar(int val) {
        raiz = insertarRec(raiz, val);
    }

    private NodoCalif insertarRec(NodoCalif nodo, int val) {
        if (nodo == null) {
            nodo = new NodoCalif(val);
            return nodo;
        }
        if (val < nodo.valor) {
            nodo.izquierda = insertarRec(nodo.izquierda, val);
        } else if (val > nodo.valor) {
            nodo.derecha = insertarRec(nodo.derecha, val);
        }
        return nodo;
    }

    public void mostrarInOrden() {
        System.out.print("Calificaciones ordenadas: ");
        inOrdenRec(raiz);
        System.out.println();
    }

    private void inOrdenRec(NodoCalif nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrdenRec(nodo.derecha);
        }
    }
}
