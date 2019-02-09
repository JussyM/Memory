/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G53554.DEV2;

import java.util.Arrays;

/**
 *
 * @author justu
 */
public class Memory {
    public static void main (String[]args){
       int []memory= new int [20];
        System.out.println(Arrays.toString(memory));
        load(memory,1,3);
        load (memory,2,1);
        load (memory,3,4);
        load (memory,4,2);
        System.out.println(Arrays.toString(memory));
        remove(memory,3);
    }

    private static void load(int[] memory, int i, int i0) {
       
    }

    private static void remove(int[] memory, int i) {
        
    }
}
