public class Contador {
    private int numero;

    public Contador(int numero){
        this.numero = numero;
    }

    public int incrementar(int numIncrementar){
        return this.numero += numIncrementar;
    }
}
