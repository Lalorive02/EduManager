public class Libro {
    String titulo;
    String autor; 

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String datos() {
        if (autor == null || autor.isEmpty()) {
            return "\"" + titulo + "\"";
        } else {
            return "\"" + titulo + "\" por " + autor;
        }
    }
}
