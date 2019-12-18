/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpetrerkingdead;
import petrerkingdead.Partida;
import petrerkingdead.Casillas;
/**
 *
 * @author cicloT
 */
public class TestPartida {
    
    
    
    public static void main(String[] args){
       
    int [][] mapa = Casillas.creaCasillasEscenarioJuego();
    int[] posicionSuperviviente = {1,5};
    int[][] posicionZombies = {
                                     {4,6},{7,8},{5,3}
    
    
    };
    
    Partida.imprimirEstadoPartida(mapa, posicionSuperviviente, posicionZombies);
    
    
    }
    
    
    
}
