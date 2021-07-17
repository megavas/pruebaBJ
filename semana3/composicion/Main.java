package semana3.composicion;

public class Main{
    public static void main(String[] args) throws Exception{
        Automovil carro = new Automovil("BMW Z3", 4, 8, 225, 2793);
        System.out.println(carro.getNumeroRuedas());
    }
}