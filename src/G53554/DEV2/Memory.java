/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G53554.DEV2;

//import java.util.Arrays;
/**
 *
 * @author justu
 */
public class Memory {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[] memory = {1, 1, 0, 0, 5};
        System.out.println(size(memory, 4));
    }

    /**
     * This method search value for the processId in the board and return the postion 
     * of the value in the board
     * @param memory
     * @param processId
     * @param fromPos
     * @return la position de la valeur qui est posValeur
     */
    public static int search(int[] memory, int processId, int fromPos) {
        int posValeur = 0;
        for (int i = fromPos; i < memory.length; i++) {
            if (memory[i] == processId) {
                posValeur = i;
            }
        }
        return posValeur;
    }

    /**
     *This method return the size of any value that repeat it self 
     * @param memory
     * @param startPos
     * @return the size of the value
     */
    public static int size(int[] memory, int startPos) {
        int taillePos = 0;
        for (int i = startPos; i < memory.length; i++) {
            while(memory[startPos] == memory[i]) {
                taillePos++;
               i++;
                
            }
           
        }
        return taillePos;
    }

    /**
     *
     * @param memory
     * @param wantedSpace
     * @return
     */
    public static int findAvailableSpace(int[] memory, int wantedSpace) {
        
        return 0;
    }

    /**
     *
     * @param memory
     * @param processId
     * @param processSize
     * @return
     */
    public static boolean load(int[] memory, int processId, int processSize) {
        return false;
    }

    /**
     *
     * @param memory
     * @param processId
     */
    public static void remove(int[] memory, int processId) {

    }

    /**
     *
     * @param memory
     */
    public static void compact(int[] memory) {

    }
}
