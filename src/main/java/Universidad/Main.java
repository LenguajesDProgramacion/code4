package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Administrativo administrativo = new Administrativo("sofia", "Tercero", "Palacio", 123456, 32, "Admin");

        Docente docente1 = new Docente("Pedro", "Peres", "Vargas", 789456, 34, "Doc1");
        Docente docente2 = new Docente("Marco", "Flores", "Lizarazo", 456789, 35, "Doc2");
        Docente docente3 = new Docente("Pablo", "Mendes", "Franco", 963258, 36, "Doc3");
        Docente docente4 = new Docente("Federico", "Paco", "Perez", 147852, 37, "Doc4");
        Docente docente5 = new Docente("Marcelo", "Lima", "Lopez", 123789, 38, "Doc5");

        Materia materia1 = new Materia("Mat1", "M1", 50);
        Materia materia2 = new Materia("Mat2", "M2", 60);
        Materia materia3 = new Materia("Mat3", "M3", 70);
        Materia materia4 = new Materia("Mat4", "M4", 80);
        Materia materia5 = new Materia("Mat5", "M5", 90);

        List<Docente> docenteList = new ArrayList<>();
        docenteList.add(docente1);
        docenteList.add(docente2);
        docenteList.add(docente3);
        docenteList.add(docente4);
        docenteList.add(docente5);

        List<Materia> materiaList = new ArrayList<>();
        materiaList.add(materia1);
        materiaList.add(materia2);
        materiaList.add(materia3);
        materiaList.add(materia4);
        materiaList.add(materia5);
    }
}
