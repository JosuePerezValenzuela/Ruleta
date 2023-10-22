import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Mesa here.
 * 
 * @author (Josue Perez Valenzuela) 
 * @version (1)
 */
public class Mesa{
    private Jugador listJugador[];
    private Ruleta ruleta;
    private int contJugadores;
    private Scanner lector;
    String[] colorTablero = {"V","R","N","R","N","R","N","R","N","R","N","N","R","N","R","N","R","N","R","R","N","R","N","R","N","R","N","R","N","N","R","N","R","N","R","N","R"};
    private String texto = "Formato para las apuestas:\n" +
                           "Todas las apuestas tendran el formato -> TIPO-DINEROyA_QUIEN?\n" +
                           "por lo que debes seguir este formato, ejemplos:\n" +
                           "Apostar a un numero -> 1num-10y1\n" +
                           "Apostar a 2 numeros -> 2num-10y1_2\n" +
                           "Apostar a 4 numeros -> 4num-10y1_2_3_4\n" +
                           "Apostar a un color -> color-10yrojo\n" +
                           "Apostar a par o impar -> PI-10ypar\n" +
                           "Apostar a 12 numeros seguidos -> 12num-10yprimeros o segundos o terceros\n" +
                           "Apostar a 12 numeros de una fila -> 12fila-10yprimera o segunda o tercera\n" +
                           "Apostar a 18 numeros seguidos -> 18num-10yprimeros o segundos\n" +
                           "O puedes decirdir no jugar esta ronda con-> paso\n";
    
    public Mesa(){
        listJugador = new Jugador[8];
        ruleta = new Ruleta();
        contJugadores = 0;
        lector = new Scanner(System.in);
    }

    public void registrarJugador(String nombre, int dinero){
        if(contJugadores <= 8){
            Jugador jugador = new Jugador(nombre, dinero);
            listJugador[contJugadores] = jugador;
            contJugadores++;
        }else{
            System.out.println("Se alcanzo el maximo numero de jugadores en la mesa");
        }
    }
    
    public void jugar(){
        System.out.println("----------------Inicio de un nuevo juego----------------");
        System.out.println(texto);
        int numAlea = ruleta.girarRuleta();
        pedirApuestas();
        System.out.println("Salio " + numAlea + " de color " +colorTablero[numAlea]);
        revisionApuestas(numAlea);
    }
    
    private void pedirApuestas(){
        for(int i = 0; i < contJugadores; i++){
            System.out.println("Apuestas del jugador " + listJugador[i].getNombre());
            String apuesta = lector.next();
            listJugador[i].crearApuestas(apuesta);
        }
    }
    
    private void revisionApuestas(int numAlea){
        for(int i = 0; i < contJugadores; i++){
            System.out.println("Jugador " +i);
            listJugador[i].verificarApuestas(numAlea);
        }
    }
}
