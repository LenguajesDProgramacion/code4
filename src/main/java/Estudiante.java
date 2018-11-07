import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int ci, int edad){
        super(nombre, apellido, ci, edad);
        this.materias = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, int ci, int edad, List<Materia> materias) {
        super(nombre, apellido, ci, edad);
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }

    public String getMateria(String key , List<Materia> materias){
        String detalle = "";
        for(Materia materia: materias){
            if(materia.getKey().equals(key)){
                detalle = materia.getKey()+"\n"+materia.getNombreMateria()+"\n"+materia.getNota();
                break;
            }
        }
        return detalle;
    }
}
