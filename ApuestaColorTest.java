

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ApuestaColorTest.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class ApuestaColorTest{
    ApuestaColor apuestaR;
    ApuestaColor apuestaN;
    public ApuestaColorTest()
    {
    }

    @BeforeEach
    public void setUp(){
        apuestaR = new ApuestaColor(10, "rojo");
        apuestaN = new ApuestaColor(10, "negro");
    }
    
    @Test
    public void TApuestaRojoW(){
        int multiplicador = apuestaR.definirResultado(1);
        assertEquals(2, multiplicador);
    }
    
    @Test
    public void TApuestaRojoL(){
        int multiplicador = apuestaR.definirResultado(2);
        assertEquals(0, multiplicador);
    }
    
    @Test
    public void TApuestaNegroW(){
        int multiplicador = apuestaN.definirResultado(2);
        assertEquals(2, multiplicador);
    }
    
    @Test
    public void TApuestaNegroL(){
        int multiplicador = apuestaN.definirResultado(1);
        assertEquals(0, multiplicador);
    }
    
    @Test
    public void TApuestaSaleVerde(){
        int multiplicador1 = apuestaR.definirResultado(0);
        int multiplicador2 = apuestaN.definirResultado(0);
        assertEquals(0, multiplicador1);
        assertEquals(0, multiplicador2);
    }

    @AfterEach
    public void tearDown(){
    }
}
