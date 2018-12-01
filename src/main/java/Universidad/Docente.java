package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {

    private List<Materia> materiaList = new ArrayList<>();

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(List<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public Docente(String nombre, String apPat, String apMat, int ci, int edad, String cargo){

        super(nombre, apPat, apMat, ci, edad, cargo);
    }

    public void addMateria(Materia materia){

        materiaList.add(materia);
    }
}
