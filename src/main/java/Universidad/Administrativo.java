package Universidad;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona {

    private List<Estudiante> estudianteList = new ArrayList<>();
    private List<Docente> docenteList = new ArrayList<>();
    private List<Materia> materiaList = new ArrayList<>();

    public Administrativo (String nombre, String apPat, String apMat, int ci, int edad, String cargo){

        super(nombre, apPat, apMat, ci, edad, cargo);
    }

    public void asignarMateriaDoc(List<Docente> docenteList, List<Materia> materiaList){

        try {
            for (Docente docente: docenteList) {

                for (Materia materia: materiaList) {

                    if (!materia.isAsignado()){

                        docente.addMateria(materia);

                        for (Materia materia1: docente.getMateriaList()) {

                            System.out.println("El docente " + docente.getNombre() + " tiene asignada la materia : " + materia);

                        }
                    }

                }

            }
        }catch (Exception e){
            System.out.println("");
        }
    }
}
