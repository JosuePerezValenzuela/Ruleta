
/**
 * Write a description of class ApuestaNum here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public abstract class ApuestaNum implements Apuesta{
    int multiplicador;
    int valorApostado;
    String[] apuesta;
    boolean estado;
    
    public ApuestaNum(int valorApostado, String[] apuesta){
        this.valorApostado = valorApostado;
        this.apuesta = apuesta;
        this.estado = false;
    }

    public int definirResultado(int numAlea){
        int tamanio = apuesta.length;
        for(int i = 0; i < tamanio; i++){
            if( Integer.parseInt(apuesta[i]) == numAlea){
                this.estado = true;
            }
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
