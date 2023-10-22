
/**
 * Write a description of class Apuesta1 here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public class Apuesta18 extends ApuestaNum{
    
    public Apuesta18(int valorApostado, String[] apuesta){
        super(valorApostado, apuesta);
        this.multiplicador = 2;
    }
    
    public int definirResultado(int numAlea){
        switch(this.apuesta[0]){
            case "primeros":
                this.estado = (numAlea <= 18 && numAlea > 0);
            break;
            case "segundos":
                this.estado = (numAlea <= 36 && numAlea > 18);
            break;
        }
        return pagar();
    }
    
}
