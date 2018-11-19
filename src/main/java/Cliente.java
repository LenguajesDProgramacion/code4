public abstract class Cliente {

    private String nombre;
    private int claveCliente;

    public Cliente(String nombre, int claveCliente){
        this.nombre = nombre;
        this.claveCliente = claveCliente;
    }

    public abstract double totalPagar();
}
