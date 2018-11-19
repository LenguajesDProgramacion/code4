import org.junit.Assert;
import org.junit.Test;
import sun.misc.Cleaner;

import static org.junit.Assert.*;

public class GrupoCTest {

    @Test
    public void totalPagar() {

        Cliente cliente1 = new GrupoA("Daniel", 123, 10500);
        Cliente cliente2 = new GrupoB("Sofia", 145, 2);
        Cliente cliente3 = new GrupoC("Andrea", 254, 20000);

        System.out.println(cliente1.totalPagar());
        System.out.println(cliente2.totalPagar());
        System.out.println(cliente3.totalPagar());
    }
}