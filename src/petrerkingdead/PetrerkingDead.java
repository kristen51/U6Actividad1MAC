/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrerkingdead;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author cicloT
 */
public class PetrerkingDead {
    
    
    public static void main(String[] args) {
        
        
        PetrerkingDead programa = new PetrerkingDead();
        
        programa.inicio();

  
    }
    
    public static void inicio(){
    
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el nº de vidas");
        boolean victoria = false;
        
        
        //Creamos mapa, decidimos nº de vidas y asignamos posicion inicial a superviviente y a los zombies
        
        int vidas = lector.nextInt();       
        int mapa[][] = Casillas.creaCasillasEscenarioJuego();
        
        int[] posicionSuperviviente = Superviviente.posicionInicialSuperviviente();
        int[] posicionSupervivienteInicial = new int[2];
        System.arraycopy(posicionSuperviviente, 0, posicionSupervivienteInicial, 0, posicionSuperviviente.length);
        
        int[][] posicionZombies = AsignarPosicionZombies(mapa);      
        int[][] posicionZombiesInicial = new int[3][2];
        System.arraycopy(posicionZombies, 0, posicionZombiesInicial, 0, posicionZombies.length);
        
        Partida.imprimirEstadoPartida(mapa, posicionSuperviviente, posicionZombies);
        
        do{
        vidas = JugarJuego(mapa, posicionSuperviviente, posicionZombies, vidas , posicionSupervivienteInicial, posicionZombiesInicial);
        }while(Partida.partidaGanada(mapa)==false && vidas != 0);
        
        if(vidas<=0){
            
            System.out.println("Has perdido");
        
        }
        
    
    }
    
    public static int JugarJuego(int [][] mapa, int [] posicionSuperviviente, int [][] posicionZombies, int vidas, int [] posicionSupervivienteInicial, int [][] posicionZombiesInicial ){
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Mueve al superviviente con wasd: ");
        char movimiento=' ';
        
        //Se mueve el superviviente
        posicionSuperviviente = Superviviente.mueveSuperviviente(posicionSuperviviente, mapa);
        
        //Se mueven los zombies
        for (int i = 0; i < 3; i++) {
            
            posicionZombies[i] = Zombies.mueveATodosLosZombies(mapa, posicionZombies[i], posicionZombies ,i);
            
        }
        //Se coje el item si el superviviente esta encima de uno
        if(Casillas.hayItem(mapa, posicionSuperviviente[0], posicionSuperviviente[1])){
        
            mapa = Casillas.vaciaCasilla(mapa, posicionSuperviviente[0], posicionSuperviviente[1]);
        
        }
        for (int i = 0; i < 3; i++) {
            
        
        if(Arrays.equals(posicionSuperviviente, posicionZombies[i])){
        
            vidas--;
            System.out.println("Has perdido una vida\n");
            posicionSuperviviente = posicionSupervivienteInicial;
            posicionZombies = posicionZombiesInicial;
        
        }
            
            }
        
        Partida.imprimirEstadoPartida(mapa, posicionSuperviviente, posicionZombies);
        return vidas;
        

    
    }
    
    public static int [][] AsignarPosicionZombies(int [][] mapa){
        
        
        int[] posicionZombie = new int[2];
        int[][] posicionZombies = new int[3][2];
    
            for (int i = 0; i < 3; i++) {
            
            posicionZombie = Zombies.posicionInicialZombiesRandom(mapa);
            posicionZombies[i] = posicionZombie;
             
        }
    
    
        return posicionZombies;
    }

    
}
