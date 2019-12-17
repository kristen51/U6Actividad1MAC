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
public class Superviviente {

    private static final char SIMBOLO_SUPERVIVIENTE = 'S';

    public static int[] posicionInicialSuperviviente() {

        int[] posicionSuperviviente = new int[2];

        posicionSuperviviente[0] = 2;
        posicionSuperviviente[1] = 3;

        return posicionSuperviviente;

    }

    public static int[] mueveSuperviviente(int[] posicionSuperviviente, int[][] mapa, char movimiento) {

        if (movimiento == 'w') {
            
            
            if (posicionSuperviviente[0]!=1) {
                posicionSuperviviente[0]--;        
            }else{System.out.println("Hay un muro en tu camino");}
            

        }

        if (movimiento == 's') {
            
            if (posicionSuperviviente[1]!= mapa.length - 2) {
                posicionSuperviviente[0]++;      
            }else{System.out.println("Hay un muro en tu camino");}
           

        }
        if (movimiento == 'a') {

            if (posicionSuperviviente[1]!=1) {
                posicionSuperviviente[1]--;        
            }else{System.out.println("Hay un muro en tu camino");}
            

        }
        if (movimiento == 'd') {
            
            if (posicionSuperviviente[1]!= mapa[0].length -2) {
                
                posicionSuperviviente[0]++;       
            }else{System.out.println("Hay un muro en tu camino");}

        }

        return posicionSuperviviente;

    }
    
}
