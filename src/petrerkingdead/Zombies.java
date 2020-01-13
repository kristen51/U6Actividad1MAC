/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrerkingdead;

import java.util.Random;

/**
 *
 * @author cicloT
 */
public class Zombies {

    private static final char SIMBOLO_ZOMBIES = 'Z';

    public static int [] posicionInicialZombiesRandom(int[][] mapa) {
        
        Random random = new Random();
        int posicionZombie[] = new int[2];
        
        do{
        
        posicionZombie[0] = random.nextInt(17);
        
        posicionZombie[1] = random.nextInt(16);
        
        }while((Casillas.hayMuro(mapa, posicionZombie[0], posicionZombie[1])));
       

        return posicionZombie;

    }
    
    //Mueve los zombies al azar

    public static int [] mueveATodosLosZombies(int[][] mapa, int[]posicionZombie, int [][]posicionZombies, int i) {
        
        int  intentosAleatorios = 0;
        boolean exito = false;
        
        //El zombie intenta moverse al azar 3 veces
        do{
        char movimiento = mueveZombiesAlAzar();
        
        if (movimiento == 'w') {

            if (!Casillas.hayMuro(mapa, posicionZombie[0]-1, posicionZombie[1]) 
                && !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0]-1, posicionZombie[1], i)) 
            {
                    posicionZombie[0]--;
                    exito = true;
                   
            } else{intentosAleatorios++;}

            }

        else if (movimiento == 's') {

            if (!Casillas.hayMuro(mapa, posicionZombie[0]+1, posicionZombie[1])&& !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0]+1, posicionZombie[1], i)) {
                    posicionZombie[0]++;
                    exito = true;
                    
            } else{intentosAleatorios++;} 

            }
        else if (movimiento == 'a') {

            if (!Casillas.hayMuro(mapa, posicionZombie[0], posicionZombie[1]-1)&& !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0], posicionZombie[1]-1, i)) {
                    posicionZombie[1]--;
                    exito = true;
            } else{intentosAleatorios++;}

            }
        else if (movimiento == 'd') {

            if (!Casillas.hayMuro(mapa, posicionZombie[0], posicionZombie[1]+1)&& !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0], posicionZombie[1]+1, i)) {
                    posicionZombie[1]++;
                    exito = true;
            }else{intentosAleatorios++;}
            
            }
        
        }while(intentosAleatorios != 3 && exito == false );
        
        // Si ninguno de los 3 movimientos aleatorios tiene exito, el zombie intentara moverse a alguna de las cuatro direcciones en orden arriba abajo izquierda derecha
        
        if(exito == false){
        
            if(!Casillas.hayMuro(mapa, posicionZombie[0]-1, posicionZombie[1]) 
                && !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0]-1, posicionZombie[1], i))
            {
            
                posicionZombie[0]--;
            
            }
            
            else if(!Casillas.hayMuro(mapa, posicionZombie[0]+1, posicionZombie[1])
                    && !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0]+1, posicionZombie[1], i))
            {
                
                posicionZombie[0]++;
            
            }
            
            else if(!Casillas.hayMuro(mapa, posicionZombie[0], posicionZombie[1]-1)&& !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0], posicionZombie[1]-1, i))
            {
                posicionZombie[1]--;
            }
            
            else if(!Casillas.hayMuro(mapa, posicionZombie[0], posicionZombie[1]+1)&& !Casillas.hayZombie(mapa, posicionZombies, posicionZombie[0], posicionZombie[1]+1, i))
            {
                posicionZombie[1]++;
            }

        
        }

        return posicionZombie;
    }
    
    public static char mueveZombiesAlAzar() {

        Random random = new Random();

        int num = random.nextInt(4);
        char movimiento = ' ';

        switch (num) {

            case 0:

                movimiento = 'w';

                break;

            case 1:

                movimiento = 's';

                break;

            case 2:

                movimiento = 'a';

                break;

            case 3:

                movimiento = 'd';

                break;

        }

        return movimiento;

        }
}




