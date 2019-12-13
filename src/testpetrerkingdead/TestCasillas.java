/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpetrerkingdead;
import petrerkingdead.Casillas;
/**
 *
 * @author cicloT
 */
public class TestCasillas {
    
    public static void main(String[] args){
    
        int[][] casillasTest = {{1, 1, 1},
        {1, 2, 1},
        {1, 1, 1}};

        boolean noHayLimite = Casillas.noHayLimite(casillasTest, 1, 1);

        if (noHayLimite == false) {

            System.out.println("OK");

        } else {

            System.out.println("Error: Prueba noHayLimite");

        }

    }



}
    
    

