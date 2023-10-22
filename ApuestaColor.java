
/**
 * Write a description of class ApuestaColor here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public class ApuestaColor implements Apuesta{
    int multiplicador;
    int valorApostado;
    String apuesta;
    boolean estado = false;
    String[] colorTablero = {"V","R","N","R","N","R","N","R","N","R","N","N","R","N","R","N","R","N","R","R","N","R","N","R","N","R","N","R","N","N","R","N","R","N","R","N","R"};
    //                        0   1   2   3   4   5   6   7   8   9   0   1   2   3   4   5   6   7   8   9   0   1   2   3   4   5   6   7   8   9   0   1   2   3   4   5   6
    public ApuestaColor(int valorApostado, String apuesta){
        this.valorApostado = valorApostado;
        this.apuesta = apuesta;
        this.multiplicador = 2;
    }
    
    public int definirResultado(int numAlea){
        String colorNumAlea = colorTablero[numAlea];
        if(this.apuesta.contains("rojo")){
            estado = (colorNumAlea == "R");
        }else if(this.apuesta.contains("negro")){
            estado = (colorNumAlea == "N");
        }
        return pagar();
    }

    public int getValorApostado(){
        return valorApostado;
    }
    
    public int pagar(){
        if(this.estado == false){
            return 0;
        }
        return multiplicador;
    }
}
