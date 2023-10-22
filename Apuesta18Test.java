

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Apuesta18Test.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class Apuesta18Test{
    Apuesta18 apuesta;
    
    public Apuesta18Test(){
    }

    @BeforeEach
    public void setUp(){
    }

    @Test
    public void test18primerosW(){
        String[] lugar = {"primeros"};
        apuesta = new Apuesta18(10, lugar);
        int resp = apuesta.definirResultado(1);
        int resp2 = apuesta.definirResultado(18);
        int resp3 = apuesta.definirResultado(9);
        assertEquals(2, resp);
        assertEquals(2, resp2);
        assertEquals(2, resp3);
    }
    
    @Test
    public void test18primerosL(){
        String[] lugar = {"primeros"};
        apuesta = new Apuesta18(10, lugar);
        int resp = apuesta.definirResultado(0);
        int resp2 = apuesta.definirResultado(19);
        int resp3 = apuesta.definirResultado(36);
        assertEquals(0, resp);
        assertEquals(0, resp2);
        assertEquals(0, resp3);
    }
    
    @Test
    public void test18segundosW(){
        String[] lugar = {"segundos"};
        apuesta = new Apuesta18(10, lugar);
        int resp = apuesta.definirResultado(19);
        int resp2 = apuesta.definirResultado(36);
        int resp3 = apuesta.definirResultado(27);
        assertEquals(2, resp);
        assertEquals(2, resp2);
        assertEquals(2, resp3);
    }
    
    @Test
    public void test18segundosL(){
        String[] lugar = {"segundos"};
        apuesta = new Apuesta18(10, lugar);
        int resp = apuesta.definirResultado(0);
        int resp2 = apuesta.definirResultado(1);
        int resp3 = apuesta.definirResultado(18);
        assertEquals(0, resp);
        assertEquals(0, resp2);
        assertEquals(0, resp3);
    }
    
    @AfterEach
    public void tearDown(){
    }
}
