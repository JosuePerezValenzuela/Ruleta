
/**
 * Write a description of class Apuesta1 here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public class Apuesta12 extends ApuestaNum{
    
    public Apuesta12(int valorApostado, String[] apuesta){
        super(valorApostado, apuesta);
        this.multiplicador = 3;
    }
    
    public int definirResultado(int numAlea){
        switch(this.apuesta[0]){
            case "primeros":
                this.estado = (numAlea <= 12 && numAlea > 0);
            break;
            case "segundos":
                this.estado = (numAlea <= 24 && numAlea > 12);
            break;
            case "terceros":
                this.estado = (numAlea <= 36 && numAlea > 24);
            break;
            case "primera":
                this.estado = (((numAlea + 2) % 3) == 0);
            break;
            case "segunda":
                this.estado = (((numAlea + 1) % 3) == 0);
            break;
            case "tercera":
                this.estado = ((numAlea % 3) == 0);
            break;
        }
        return pagar();
    }
    
}
