package Universidad;

public class Persona {
    private String nombre;
    private String apPat;
    private String apMat;
    private int ci;
    private int edad;
    private String cargo;

    public Persona(String nombre, String apPat, String apMat, int ci, int edad, String cargo) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.ci = ci;
        this.edad = edad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
