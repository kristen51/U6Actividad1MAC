/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrerkingdead;

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
        
        //int vidas = lector.nextInt();       
        int mapa[][] = Casillas.creaCasillasEscenarioJuego();
        int[] posicionSuperviviente = Superviviente.posicionInicialSuperviviente();
        int[][] posicionZombies = AsignarPosicionZombies(mapa);
        
        Partida.imprimirEstadoPartida(mapa, posicionSuperviviente, posicionZombies);
        
        do{
        JugarJuego(mapa, posicionSuperviviente, posicionZombies);
        }while(victoria==false);
               
        
    
    
    
    
    }
    
    public static void JugarJuego(int [][] mapa, int [] posicionSuperviviente, int [][] posicionZombies){
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Mueve al superviviente con wasd: ");
        char movimiento=' ';
        
        //Se mueve el superviviente
        posicionSuperviviente = Superviviente.mueveSuperviviente(posicionSuperviviente, mapa);
        
        //Se mueven los zombies
        for (int i = 0; i < 3; i++) {
            
            posicionZombies[i] = Zombies.mueveATodosLosZombies(mapa, posicionZombies[i]);
            
        }
        //Se coje el item si el superviviente esta encima de uno
        if(Casillas.hayItem(mapa, posicionSuperviviente[0], posicionSuperviviente[1])){
        
            mapa = Casillas.vaciaCasilla(mapa, posicionSuperviviente[0], posicionSuperviviente[1]);
        
        }
        
        Partida.imprimirEstadoPartida(mapa, posicionSuperviviente, posicionZombies);
        

    
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
