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
public class Superviviente {

    private static final char SIMBOLO_SUPERVIVIENTE = 'S';

    public static int[] posicionInicialSuperviviente() {

        int[] posicionSuperviviente = new int[2];

        posicionSuperviviente[0] = 1;
        posicionSuperviviente[1] = 5;

        return posicionSuperviviente;

    }
    
    //Mueve al superviviente si no hay un muro en la direccion en la que se mueve

    public static int[] mueveSuperviviente(int[] posicionSuperviviente, int[][] mapa) {

        Scanner lector = new Scanner(System.in);

        char movimiento;
        

        do {
            
            movimiento = lector.next().charAt(0);

            if (movimiento == 'w') {

                if (!Casillas.hayMuro(mapa, posicionSuperviviente[0]-1, posicionSuperviviente[1])) {
                    posicionSuperviviente[0]--;
                   
                } else {
                    System.out.println("Hay un muro en tu camino y pierdes el turno");
                    
                }

            }

            else if (movimiento == 's') {

                if (!Casillas.hayMuro(mapa, posicionSuperviviente[0]+1, posicionSuperviviente[1])) {
                    posicionSuperviviente[0]++;
                } else {
                    System.out.println("Hay un muro en tu camino y pierdes el turno");
                    
                }

            }
            else if (movimiento == 'a') {

                if (!Casillas.hayMuro(mapa, posicionSuperviviente[0], posicionSuperviviente[1]-1)) {
                    posicionSuperviviente[1]--;
                } else {
                    System.out.println("Hay un muro en tu camino y pierdes el turno");
                    
                }

            }
            else if (movimiento == 'd') {

                if (!Casillas.hayMuro(mapa, posicionSuperviviente[0], posicionSuperviviente[1]+1)) {
                    posicionSuperviviente[1]++;
                } else {
                    System.out.println("Hay un muro en tu camino y pierdes el turno");
                    
                }

            }
            
            else{System.out.print("Formato incorrecto\nIntroduzca una opción válida: ");}

        } while (!formatoMovimientoCorrecto(movimiento));

        return posicionSuperviviente;

    }
    
    
    
    
    public static boolean formatoMovimientoCorrecto(char movimiento){
        
        boolean formatoCorrecto = false;
        
        if(movimiento == 'w' || movimiento == 's' || movimiento == 'a' || movimiento == 'd'){
        
            formatoCorrecto = true;
        
        }

        return formatoCorrecto;
    
    }

}
