

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ApuestaParImparTest.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class ApuestaParImparTest{
    ApuestaParImpar apuestaP;
    ApuestaParImpar apuestaI;
    public ApuestaParImparTest(){
    }

    @BeforeEach
    public void setUp(){
        apuestaP = new ApuestaParImpar(10, "par");
        apuestaI = new ApuestaParImpar(10, "impar");
    }
    
    @Test
    public void TApuestaParW(){
        int multiplicador = apuestaP.definirResultado(2);
        assertEquals(2, multiplicador);
    }
    
    @Test
    public void TApuestaParL(){
        int multiplicador = apuestaP.definirResultado(1);
        assertEquals(0, multiplicador);
    }
    
    @Test
    public void TApuestaImparW(){
        int multiplicador = apuestaI.definirResultado(1);
        assertEquals(2, multiplicador);
    }
    
    @Test
    public void TApuestaImparL(){
        int multiplicador = apuestaI.definirResultado(2);
        assertEquals(0, multiplicador);
    }
    
    @Test
    public void TApuestaSale0(){
        int multiplicador1 = apuestaP.definirResultado(0);
        int multiplicador2 = apuestaI.definirResultado(0);
        assertEquals(0, multiplicador1);
        assertEquals(0, multiplicador2);
    }

    @AfterEach
    public void tearDown(){
    }
}
