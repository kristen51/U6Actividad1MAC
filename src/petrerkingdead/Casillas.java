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
        
        
        int[][] mapa = new int[][]{
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
        
        return mapa;
  
    
    
    
    }
    
    
    
    public static boolean hayItem(int [][] mapa, int x, int y){
    
        boolean hayItem = false;
        
        if(mapa[x][y]== TIPO_ITEM){
            hayItem = true;
        }
    
        return hayItem;
    
    }
    
    public static boolean hayMuro(int [][] mapa, int x, int y){
    
        boolean hayMuro = false;
        
        if(mapa[x][y]== TIPO_LIMITE){
            hayMuro = true;
        }
    
        return hayMuro;
    
    }
    
    public static int [][] vaciaCasilla(int [][] mapa, int x, int y){
    
        mapa[x][y] = TIPO_VACIA;
        
        return mapa;
    
    
    
    }
    public static void casillaATexto(int [][] mapa, int x, int y){
        
        
        switch(mapa[x][y]){
        
            case 1:System.out.print(" ");
            break;
            
            case 2:System.out.print("\"");
            break;
            
            case 3:System.out.print(".");
            break;
           
        }

    
    }
    
    
}
