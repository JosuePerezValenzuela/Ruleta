import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Jugador here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public class Jugador{
    private String nombre;
    private int dinero;
    private ArrayList <Apuesta> listApuestas;
    private Scanner lector;
    
    public Jugador(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
        this.listApuestas = new ArrayList <>();
        lector = new Scanner(System.in);
    }

    protected void crearApuestas(String apuesta){
        //Ya lei la apuesta en mesa
        if(apuesta.contains("paso")){
            return;
        }
        String[] aux2 = null;
        Apuesta aux = null;
        String[] partes = apuesta.split(",");
        int tamanio = partes.length;
        int valorApuestaTotal = 0;
        int dineroInicial = dinero;
        for(int i = 0; i < tamanio; i++){
            String[] unaApuesta = partes[i].split("-");
            aux2 = unaApuesta[1].split("y");
            int valorApostado = Integer.parseInt(aux2[0]);
            switch(unaApuesta[0]){
                case "1num":
                    aux = new Apuesta1(valorApostado, aux2[1].split("_"));
                break;
                case "2num":
                    aux = new Apuesta2(valorApostado, aux2[1].split("_"));
                break;
                case "4num":
                    aux = new Apuesta4(valorApostado, aux2[1].split("_"));
                break;
                case "color":
                    aux = new ApuestaColor(valorApostado, aux2[1]);
                break;
                case "PI":
                    aux = new ApuestaParImpar(valorApostado, aux2[1]);
                break;
                case "12num":
                    aux = new Apuesta12(valorApostado, aux2[1].split(" "));
                break;
                case "12fila":
                    aux = new Apuesta12(valorApostado, aux2[1].split(" "));
                break;
                case "18num":
                    aux = new Apuesta18(valorApostado, aux2[1].split(" "));
                break;
            }
            valorApuestaTotal += valorApostado;
            listApuestas.add(aux);
            dinero -= Integer.parseInt(aux2[0]);
        }
        
        if(valorApuestaTotal > dineroInicial){
            dinero = dineroInicial;
            System.out.println("Saldo insuficiente para realizar estas apuestas, realiza otra apuesta o pasa de ronda");
            limpiarApuestas();
            String apuestaNueva = lector.next();
            crearApuestas(apuestaNueva);
        }
    }
    
    protected void verificarApuestas(int numAlea){
        int tamanio = listApuestas.size();
        for(int i = 0; i < tamanio; i++){
            int multiplicador = listApuestas.get(i).definirResultado(numAlea);
            int pagar = listApuestas.get(i).getValorApostado() * multiplicador;
            dinero += pagar;
            System.out.println("La apuesta " +(i+1)+ " genero un monto a pagar de " + pagar);
        }
        limpiarApuestas();
    }
    
    protected void limpiarApuestas(){
        listApuestas.clear();
    }
    
    protected String getNombre(){
        return this.nombre;
    }
    
    protected int getDinero(){
        return this.dinero;
    }
    
    protected ArrayList<Apuesta> getApuestas(){
        return this.listApuestas;
    }
    
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    protected void setDinero(int dinero){
        this.dinero = dinero;
    }
}
