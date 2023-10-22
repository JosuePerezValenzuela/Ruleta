import java.util.Random;
/**
 * Write a description of class RuletaSImple here.
 * 
 * @author (Josue Perez Valenuzela) 
 * @version (1)
 */
public class Ruleta{

    public Ruleta(){
    }

    protected int girarRuleta(){
        Random random = new Random();
        int numAle = random.nextInt(37);
        return numAle;
    }
}