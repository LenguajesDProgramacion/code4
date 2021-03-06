import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {

    @Test
    public void estudiante(){

        Estudiante estudiante = new Estudiante("Vladimir", "Fernandez", 6418292, 27);
        Materia materia1 = new Materia("ingles", "123A", 55);
        Materia materia2 = new Materia("Lenguaje", "123B", 98);
        Materia materia3 = new Materia("Fisica", "123C", 87);
        List<Materia> m = new ArrayList<>();
        m.add(materia1);
        m.add(materia2);
        m.add(materia3);
        System.out.println(estudiante.getMateria("123C",m));
        Assert.assertEquals(("123C"+"\n"+"Fisica"+"\n"+87),estudiante.getMateria("123C",m));

    }

    @Test
    public void getNotaMin() {

        Estudiante estudiante = new Estudiante("Vladimir", "Fernandez", 6418292, 27);
        Materia materia1 = new Materia("ingles", "123A", 55);
        Materia materia2 = new Materia("Lenguaje", "123B", 98);
        Materia materia3 = new Materia("Fisica", "123C", 17);

        estudiante.addMateria(materia1);
        estudiante.addMateria(materia2);
        estudiante.addMateria(materia3);

        Assert.assertEquals(17, estudiante.getNotaMin());
    }
}