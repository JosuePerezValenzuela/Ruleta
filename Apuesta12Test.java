

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Apuesta12Test.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class Apuesta12Test{
    Apuesta12 apuesta;
    
    public Apuesta12Test(){
    }

    @BeforeEach
    public void setUp(){
    }

    @Test
    public void test12PrimerasW(){
        String[] lugar = {"primeros"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(1);
        int resp2 = apuesta.definirResultado(12);
        assertEquals(3, resp);
        assertEquals(3, resp2);
    }
    
    @Test
    public void test12PrimerasL(){
        String[] lugar = {"primeros"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(0);
        int resp2 = apuesta.definirResultado(36);
        assertEquals(0, resp);
        assertEquals(0, resp2);
    }
    
    @Test
    public void test12SegundosW(){
        String[] lugar = {"segundos"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(13);
        int resp2 = apuesta.definirResultado(24);
        assertEquals(3, resp);
        assertEquals(3, resp2);
    }
    
    @Test
    public void test12SegundosL(){
        String[] lugar = {"segundos"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(12);
        int resp2 = apuesta.definirResultado(25);
        assertEquals(0, resp);
        assertEquals(0, resp2);
    }
    
    @Test
    public void test12TercerosW(){
        String[] lugar = {"terceros"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(25);
        int resp2 = apuesta.definirResultado(36);
        assertEquals(3, resp);
        assertEquals(3, resp2);
    }
    
    @Test
    public void test12TercerosL(){
        String[] lugar = {"terceros"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(24);
        int resp2 = apuesta.definirResultado(0);
        assertEquals(0, resp);
        assertEquals(0, resp2);
    }
    
    @Test
    public void testFila1W(){
        String[] lugar = {"primera"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(1);
        int resp2 = apuesta.definirResultado(19);
        int resp3 = apuesta.definirResultado(34);
        assertEquals(3, resp);
        assertEquals(3, resp2);
        assertEquals(3, resp3);
    }
    
    @Test
    public void testFila1L(){
        String[] lugar = {"primera"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(2);
        int resp2 = apuesta.definirResultado(21);
        int resp3 = apuesta.definirResultado(35);
        assertEquals(0, resp);
        assertEquals(0, resp2);
        assertEquals(0, resp3);
    }
    
    @Test
    public void testFila2W(){
        String[] lugar = {"segunda"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(2);
        int resp2 = apuesta.definirResultado(20);
        int resp3 = apuesta.definirResultado(35);
        assertEquals(3, resp);
        assertEquals(3, resp2);
        assertEquals(3, resp3);
    }
    
    @Test
    public void testFila2L(){
        String[] lugar = {"segunda"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(1);
        int resp2 = apuesta.definirResultado(21);
        int resp3 = apuesta.definirResultado(34);
        assertEquals(0, resp);
        assertEquals(0, resp2);
        assertEquals(0, resp3);
    }
    
    @Test
    public void testFila3W(){
        String[] lugar = {"tercera"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(3);
        int resp2 = apuesta.definirResultado(21);
        int resp3 = apuesta.definirResultado(36);
        assertEquals(3, resp);
        assertEquals(3, resp2);
        assertEquals(3, resp3);
    }
    
    @Test
    public void testFila3L(){
        String[] lugar = {"tercera"};
        apuesta = new Apuesta12(10, lugar);
        int resp = apuesta.definirResultado(1);
        int resp2 = apuesta.definirResultado(20);
        int resp3 = apuesta.definirResultado(34);
        assertEquals(0, resp);
        assertEquals(0, resp2);
        assertEquals(0, resp3);
    }
    
    @AfterEach
    public void tearDown()
    {
    }
}
