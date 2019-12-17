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

    public static int[] posicionInicialZombies(int x, int y) {

        int[] posicionZombie = {x, y};

        return posicionZombie;

    }

    public static char mueveATodosLosZombies() {

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
