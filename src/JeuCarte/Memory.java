/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuCarte;

import java.util.Scanner;

/**
 *
 * @author jussy-lili
 */
public class Memory {

    /**
     * This method init the car in an arrays
     *
     * @param n
     * @return arraysCard
     */
    public static int[] initCard(int n) {
        int[] arraysCard = new int[n * 2];
        int paire = 1;
        for (int i = 0; i < arraysCard.length; i++) {
            arraysCard[i] = paire;
            if (i % 2 == 1) {
                paire++;
            }
            ArrayUtil.shuffle(arraysCard);

        }
        return arraysCard;
    }

    /**
     * This method ask the a position to the user
     *
     * @param cards
     * @param collectedCards
     * @return pos
     */
    public static int askPosition(int[] cards, boolean[] collectedCards) {
        String message = "Veuillez entrez une position" + "(" + "0" + " à " + cards.length + ") " + ":";
        int pos = askPosition(message);
        while (pos > cards.length || pos < 0 || collectedCards[pos]) {
            System.out.println("La position donné ne réfère à rien");
            pos = askPosition(message);
        }

        return pos;
    }

    /**
     * check if the two position are equal and return a boolean if the card in
     * that position are the same
     *
     * @param cards
     * @param collectedCards
     * @param pos1
     * @param pos2
     * @return boolean
     */
    public static boolean checkAndCollect(int[] cards, boolean[] collectedCards, int pos1, int pos2) {
        if (pos1 == pos2) {
            throw new IllegalArgumentException("Les deux positions ne doivent pas être égaux");
        } else if (cards[pos1] == cards[pos2]) {
            collectedCards[pos1] = true;
            collectedCards[pos2] = true;
            return true;

        }
        return false;
    }

    /**
     * Check if the game is over so if all the boolean in the arrays are true
     *
     * @param collectedCards
     * @return boolean
     */
    public static boolean isGameOver(boolean[] collectedCards) {
        for (int i = 0; i < collectedCards.length; i++) {
            if (collectedCards[i] == true) {
                return true;
            }

        }
        return false;
    }

    /**
     * Method that init and generate the game return the number of tour
     *
     * @param n
     * @return nbtour
     */
    public static int playMemory(int n) {
        int nbtour = 1;

        while (!isGameOver(collectCard(n))) {
            System.out.println("**** tour " + nbtour);
            int[] cardArrays = initCard(n);
            hideCards(cardArrays, collectCard(n));
            int posCard = askPosition(cardArrays, collectCard(n));
            displayCardSelect(posCard, cardArrays);
            int posCard2 = askPosition(cardArrays, collectCard(n));
            displayCardSelect(posCard2, cardArrays);
            conform(cardArrays, collectCard(n), posCard, posCard2);
            nbtour++;
        }

        return nbtour;
    }

    private static void displayCardSelect(int pos, int[] tab) {
        System.out.println("La carte en position " + pos + " est " + tab[pos]);

    }

    /**
     * init an arrays of boolean
     *
     * @param n
     * @return tab
     */
    public static boolean[] collectCard(int n) {
        boolean[] tab = new boolean[2 * n];
        return tab;

    }

    /**
     * Prind a message if the card are the same or not
     *
     * @param cards
     * @param collectedCards
     * @param pos1
     * @param pos2
     */
    private static void conform(int[] cards, boolean[] collectedCards, int pos1, int pos2) {
        boolean collect = checkAndCollect(cards, collectedCards, pos1, pos2);
        if (collect) {
            System.out.println("Elles correspondent !");
        } else {
            System.out.println("Elles ne correspondent pas ");
        }
    }

    /**
     * This method hide the card in the game
     *
     * @param tab
     * @param tabB
     */
    public static void hideCards(int[] tab, boolean[] tabB) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print((tabB[i] ? tab[i] : "?") + " ");

        }
        System.out.println("");
    }

    /**
     * ask Value to the player
     *
     * @param message
     * @return value ask
     */
    public static int askPosition(String message) {
        System.out.println(message);
        Scanner kb = new Scanner(System.in);
        return kb.nextInt();
    }

    /**
     * Print the message
     *
     * @return message
     */
    private static String[] message() {
        String message1 = "Avec combien de paire voulez-vous jouer ? (3 à 20): ";
        String[] message = {message1};
        return message;
    }

    /**
     * Finally display the game
     */
    public static void displayGame() {
        System.out.println("***MEMORY***");
        int paire = askPosition(message()[0]);
        playMemory(paire);
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        displayGame();

    }

}
