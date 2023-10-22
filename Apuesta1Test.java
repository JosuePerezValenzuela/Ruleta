

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Apuesta1Test.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class Apuesta1Test{
    Apuesta1 apuesta;
    String[] listaApuesta = {"1"};
    
    public Apuesta1Test(){
    }

    @BeforeEach
    public void setUp(){
        apuesta = new Apuesta1(10, listaApuesta);
    }
    
    @Test
    public void testApuestaW(){
        int resp = apuesta.definirResultado(1);
        assertEquals(36, resp);
    }
    
    @Test
    public void testApuestaL(){
        int resp = apuesta.definirResultado(2);
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
