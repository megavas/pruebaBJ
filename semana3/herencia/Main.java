package semana3.herencia;

public class Main{
    public static void main(String[] args) throws Exception{
        Gato gatito = new Gato(30, true, 4, 60);
        Perro perrito = new Perro(42, true, 4, false);
        // Un m�todo heredado en ejecuci�n:
        System.out.println(gatito.getNDientes());
        System.out.println(perrito.getNDientes());
    }
}