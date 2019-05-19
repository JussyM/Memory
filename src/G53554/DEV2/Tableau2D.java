/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G53554.DEV2;

//import java.util.Scanner;
/**
 *
 * @author justu
 */
public class Tableau2D {

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 4, 4}, {5, 6, 7, 8, 9}};
        afficherLignes(tab);
    }

    public static void afficherLignes(int tab[][]) {
        int lg=0;
        int col=0;
        for (int[] tab1 : tab) {
            System.out.println(tab[lg][col]);
            col++;
            if(col==tab[lg].length){
                col=0;
                lg++;
            }
        }

    }

}
