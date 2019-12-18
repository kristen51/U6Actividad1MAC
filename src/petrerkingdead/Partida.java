/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrerkingdead;

/**
 *
 * @author cicloT
 */
public class Partida {
    
    
    public static void imprimirEstadoPartida(int [][] mapa, int [] posicionSuperviviente, int [][] posicionZombies){
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                
                    if(i== posicionSuperviviente[0] && j== posicionSuperviviente[1]){System.out.print("S");}
                    
                    else if(i == posicionZombies[0][0] && j == posicionZombies[0][1] || i == posicionZombies[1][0] && j == posicionZombies[1][1] || i == posicionZombies[2][0] && j == posicionZombies[2][1]){
                        System.out.print("Z");
                
            
            }
                    
                    else{
                    Casillas.casillaATexto(mapa, i, j);
                    }
                
                
                
            }
            System.out.print("\n");
            
        }
    
    
    
    
    }
    
    public static void mueveATodosPersonajes(int [][] mapa,char movimiento, int[] posicionSuperviviente, int [][][] posicionZombies){
    
    
    }
    
    public static boolean partidaGanada(int [][] mapa){
        
        boolean quedanItems = false;
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                
                if(mapa[i][j] == 3){
                    
                    quedanItems = true;
                }
                
            }
        }
        
        
        return !quedanItems;
    
    
    }
    public static void partidaPerdida(){
    
    
    
    
    }
    
    
    
    
    
}
