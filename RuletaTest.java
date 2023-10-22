import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class RuletaSImpleTest.
 *
 * @author  (Josue Perez Valenzuela)
 * @version (1)
 */
public class RuletaTest{
    Ruleta ruleta;
    /**
     * Default constructor for test class RuletaSImpleTest
     */
    public RuletaTest(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp(){
        ruleta = new Ruleta();
    }

    @Test
    public void TNumAleatorio(){
        int num = ruleta.girarRuleta();
        assertTrue(num >= 0 && num <= 36);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown(){
    }
}