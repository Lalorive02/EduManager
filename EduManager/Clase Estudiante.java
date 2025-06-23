public class Estudiante {
    String nombre, id, grupo;
    int grupo;

    public Estudiante(String nombre, String id, int grado, String grupo) {
        this.nombre = nombre;
        this.id = id;
        this.grado = grado;
        this.grupo = grupo; 
    }

    public String datos() {
        return id + " - " + nombre + " (Grado " + grado + grupo + ")";
    }
}