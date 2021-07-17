package semana3.herencia;

public class Gato extends Animal {
    protected int volRonroneo;

    public Gato(int nDientes, boolean pelaje, int nPatas, int volRonroneo) {
        // Atributos heredados
        this.nDientes= nDientes;
        this.pelaje= pelaje;
        this.nPatas= nPatas;
        // Atributos particulares
        this.volRonroneo= volRonroneo;
    }
    // Se heredan todos los métodos que no sean privados
    // El siguiente es un método particular, solo presente en la clase Gato
    public int getVolRonroneo() {
        return this.volRonroneo;
    }
}