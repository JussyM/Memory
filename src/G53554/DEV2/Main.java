/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G53554.DEV2;

/**
 *
 * @author justu
 */
public class Main {
    public static void main (String[]args){
        Point p= new Point(1,2);
        System.out.println("Mon point: "+p);
        p.display();
        System.out.println("Abscice: " + p.getX());
        System.out.println("Ordonné: " + p.getY());
        Point p2= new Point(1,3);
        System.out.println(p2.toString());
         
    }
}
