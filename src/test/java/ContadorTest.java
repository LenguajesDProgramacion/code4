import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContadorTest {
    private static final int incrementador = 10;

    @Test
    public void incrementar() {

        Contador contador = new Contador(5);
        Assert.assertEquals(15, contador.incrementar(incrementador));
    }
}