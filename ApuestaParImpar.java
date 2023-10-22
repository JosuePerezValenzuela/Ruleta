
/**
 * Write a description of class ApuestaParImpar here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public class ApuestaParImpar implements Apuesta{
    int multiplicador;
    int valorApostado;
    String apuesta;
    boolean estado = false;
    
    public ApuestaParImpar(int valorApostado, String apuesta){
        this.valorApostado = valorApostado;
        this.apuesta = apuesta;
        this.multiplicador = 2;
    }
    
    public int definirResultado(int numAlea){
        if(numAlea == 0){
            return pagar();
        }else if(this.apuesta.contains("impar")){
            estado = ((numAlea % 2) != 0);
        }else if(this.apuesta.contains("par")){
            estado = ((numAlea % 2) == 0);
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