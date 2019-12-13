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
public class Casillas {
    
    private static final int TIPO_VACIA = 1;
    private static final int TIPO_LIMITE = 2;
    private static final int TIPO_ITEM = 3;
    
    /**
     * 
     * @param casillas
     * @param x
     * @param y
     * @return True si en x,y no hay un límite, false en caso contrario 
     */
    
    public static boolean noHayLimite(int [][] casillas, int x, int y){
        
        if(casillas[x][y] != TIPO_LIMITE){
            return true;
        
        }
        else{return false;}

    
    
    }
    
    
    public static int [][] creaCasillasEscenarioJuego(){
        
        int lim = TIPO_LIMITE;
        int item = TIPO_ITEM;
        int nada = TIPO_VACIA;
        
        
        int[][] casillas = new int[][]{
            {lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim},
            {lim,item,item,item,nada,nada,nada,nada,nada,nada,nada,nada,nada,nada,item,lim},
            {lim,item,lim,lim,item,lim,lim,lim,item,item,item,lim,lim,lim,item,lim},
            {lim,item,item,item,item,item,nada,nada,nada,nada,nada,nada,nada,nada,nada,lim},
            {lim,item,lim,lim,item,lim,item,lim,lim,lim,lim,lim,item,lim,item,lim},
            {lim,item,nada,nada,nada,lim,nada,nada,nada,nada,nada,nada,nada,lim,item,lim},
            {lim,lim,lim,lim,item,lim,lim,lim,item,lim,item,lim,lim,lim,item,lim},
            {lim,lim,lim,lim,item,lim,item,item,item,item,item,item,item,lim,item,lim},
            {lim,lim,lim,lim,item,item,item,lim,lim,lim,lim,lim,item,item,item,lim},
            {lim,lim,lim,lim,item,lim,nada,nada,nada,nada,nada,nada,nada,lim,item,lim},
            {lim,lim,lim,lim,item,lim,lim,lim,item,lim,item,lim,lim,lim,item,lim},
            {lim,item,item,item,item,lim,item,item,item,lim,item,item,item,lim,item,lim},
            {lim,item,lim,lim,item,lim,item,lim,lim,lim,lim,lim,item,lim,item,lim},
            {lim,item,item,item,item,item,item,item,item,item,item,item,item,item,item,lim},
            {lim,item,lim,lim,item,lim,lim,lim,item,lim,item,lim,lim,lim,item,lim},
            {lim,item,item,item,nada,nada,nada,nada,nada,lim,nada,nada,nada,nada,nada,lim},
            {lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim,lim}
        };
        
        return casillas;
  
    
    
    
    }
    
    
    
    public static void hayItem(int [][] casillas, int x, int y){
    
    
    
    
    
    }
    public static void vaciaCasilla(int [][] casillas, int x, int y){
    
    
    
    
    
    }
    public static void casillaATexto(int [][] casillas, int x, int y){
        
        
        switch(casillas[x][y]){
        
            case 1:System.out.println(" ");
            break;
            case 2:System.out.println("\"");
            break;
            case 3:System.out.println(".");
           
        }

    
    }
    
    
}
