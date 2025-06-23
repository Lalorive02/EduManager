public class MainSalones {
    public static void main(String[] args) {
        MapaSalones mapa = new MapaSalones();

        mapa.conectar("A1", "B2");
        mapa.conectar("A1", "C3");
        mapa.conectar("B2", "D4");

        System.out.println();
        mapa.mostrarConexiones("A1");
        mapa.mostrarConexiones("B2");
        mapa.mostrarConexiones("X9"); 

        System.out.println();
        mapa.mostrarTodo();
    }
}
