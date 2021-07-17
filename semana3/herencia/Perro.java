package semana3.herencia;

public class Perro extends Animal {
    protected boolean esAlpha;

    public Perro(int nDientes, boolean pelaje, int nPatas, boolean esAlpha) {
        // Atributos heredados
        this.nDientes= nDientes;
        this.pelaje= pelaje;
        this.nPatas= nPatas;
        // Atributos particulares
        this.esAlpha= esAlpha;
    }
    // Se heredan todos los m�todos que no sean privados
    // El siguiente es un m�todo particular, solo presente en la clase Perro
    public boolean esAlpha() {
        return this.esAlpha;
    }
}