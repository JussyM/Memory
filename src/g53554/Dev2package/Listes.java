package g53554.Dev2package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jussy
 */
public class Listes {

    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<>();
        List<Integer> liste2 = new ArrayList<>();
        miseEnBouche(liste1);
        //miseEnBouche(liste2);
        //concaténation(liste1, liste2);
        //System.out.println(sommeListe(liste1));
        lesExtremes(liste1);
    }

    /**
     * This method show the way you can add and remove object in a list
     *
     * @param liste
     */
    public static void miseEnBouche(List<Integer> liste) {
        liste.add(62);//ajouter 42 à la liste en postion 0
        liste.add(54);// ajouter 54 à la liste en position 1
        liste.set(1, 44);// remplacer 54 par 44 en postion 1
        liste.add(1, 43);// ajouter 43 en position 1 
        System.out.println(liste);//affiche la liste
        //liste.remove(liste.size()-1);// supprimer le dernier élement de la liste
        //liste.remove(42); //supprimer la valeur 42
        //liste.clear(); // vider la liste 

    }

    /**
     * This method return the sum of all the value in a list
     *
     * @param liste
     * @return
     */
    public static int sommeListe(List<Integer> liste) {
        int somme = 0;
        for (int i = 0; i < liste.size(); i++) {
            somme += liste.get(i);

        }
        return somme;
    }

    /**
     * This method add the object of list two at the end of list one without
     * changing the value of list 2
     *
     * @param liste1
     * @param liste2
     * @return liste1
     */
    public static List concaténation(List<Integer> liste1, List<Integer> liste2) {
        for (int i = 0; i < liste2.size(); i++) {
            liste1.add(liste2.get(i));
        }
        return liste1;
    }

    /**
     *
     * @param liste
     */
    public static void lesExtremes(List<Integer> liste) {
        liste.remove(Collections.min(liste));// enlève le minimum 
        liste.remove(Collections.max(liste));// enlève le maximum en utilisant les collections
        System.out.println(liste);

    }

    /**
     * This method remove the the number duplicated in the list it can be use
     * for non primitive attribut
     *
     * @param liste
     * @return
     */

    public static List eliminerDoublons(List<Integer> liste) {
        Set<Integer> myset = new HashSet<>(liste);// hashset élimine les doublons de la liste
        List<Integer> liste2 = new ArrayList<>(myset);
        return liste2;

    }
    /**
     * This method print in order a list
     * @param liste
     * @param liste2 
     */

    public static void concaténationAvectrie(List<Integer> liste, List<Integer> liste2) {
        Collections.sort(concaténation(liste, liste2));// trié en ordre croissant
        Collections.sort(concaténation(liste, liste2), Collections.reverseOrder());// trié en ordre décroissant
        Collections.reverse(concaténation(liste, liste2));// inversé l'ordre des liste

    }

}
