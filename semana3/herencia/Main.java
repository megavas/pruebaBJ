package semana3.herencia;

public class Main{
    public static void main(String[] args) throws Exception{
        Gato gatito = new Gato(30, true, 4, 60);
        Perro perrito = new Perro(42, true, 4, false);
        // Un método heredado en ejecución:
        System.out.println(gatito.getNDientes());
        System.out.println(perrito.getNDientes());
    }
}