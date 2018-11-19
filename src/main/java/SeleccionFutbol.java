public abstract class SeleccionFutbol {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public SeleccionFutbol(int id, String nombre, String apellido, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract boolean viaja();

    public abstract void concentracion();

    public abstract void entrenamiento();

    public abstract void partidoFutbol();
}
