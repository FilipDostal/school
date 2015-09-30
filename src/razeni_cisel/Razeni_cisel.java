/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razeni_cisel;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Razeni_cisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cislo;
        int i = 1;
        int posun = 0;
        int[] serazeni = new int[100];
        int[] serazeni1 = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.println("zadej První číslo.");
        cislo = in.nextInt();
        serazeni[0] = cislo;
        System.out.println("Číslo nula ukončí zadávání a vypíše hodnoty.");
        while (true) {
            System.out.println("zadej další číslo.");
            cislo = in.nextInt();
            if (cislo == 0) {
                break;
            }
            if (i == 1) {
                for (int a = 0; a < 99; a++) {
                    if (serazeni[a] < cislo && posun == 0) {
                        serazeni1[a] = cislo;
                        posun = 1;
                        serazeni1[a + 1] = serazeni[a];
                    } else if (posun == 1) {
                        serazeni1[a + 1] = serazeni[a];
                    } else {
                        serazeni1[a] = serazeni[a];
                    }

                }
                posun = 0;
                i = 2;

            } else {
                for (int a = 0; a < 99; a++) {
                    if (serazeni1[a] < cislo && posun == 0) {
                        serazeni[a] = cislo;
                        posun = 1;
                        serazeni[a + 1] = serazeni1[a];
                    } else if (posun == 1) {
                        serazeni[a + 1] = serazeni1[a];
                    } else {
                        serazeni[a] = serazeni1[a];
                    }

                }
                posun = 0;
                i = 1;
            }

        }
        System.out.println("----------------------------");
        if (i == 1) {
            for (int y : serazeni) {
                if (y != 0) {
                    System.out.println(y);
                }
            }
        }
        if (i == 2) {
            for (int y : serazeni1) {
                if (y != 0) {
                    System.out.println(y);
                }
            }
        }
        System.out.println("Konec");

    }

}
