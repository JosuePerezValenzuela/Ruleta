

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Apuesta2Test.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class Apuesta2Test{
    Apuesta2 apuesta;
    String[] listaApuesta = {"1","2"};
    public Apuesta2Test(){
    }

    @BeforeEach
    public void setUp(){
        apuesta = new Apuesta2(10, listaApuesta);
    }
    
    @Test
    public void testApuestaW(){
        int resp = apuesta.definirResultado(1);
        assertEquals(18, resp);
    }
    
    @Test
    public void testApuestaL(){
        int resp = apuesta.definirResultado(3);
        assertEquals(0, resp);
    }
    
    @Test
    public void testApuesta0(){
        int resp = apuesta.definirResultado(0);
        assertEquals(0, resp);
    }

    @AfterEach
    public void tearDown(){
    }
}
