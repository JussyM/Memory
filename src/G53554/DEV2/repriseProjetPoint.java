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
public class repriseProjetPoint {

    private double x;
    private double y;

    /**
     * This method display the value of the points
     */
    public void display() {

    }

    /**
     * This It return the value of x
     *
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * This method return the value of point y
     *
     * @return
     */
    public double getY() {
        return y;
    }

    /**
     * This methode is a constructor that build the value of x and y
     *
     * @param x
     * @param y
     */
    public repriseProjetPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This method print the value in the constructor
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(repriseProjetPoint p) {
        return Math.sqrt(Math.pow(p.x - this.x, -2) + Math.pow(p.y - this.y, -2));
    }

    public static void main(String[] args) {
        repriseProjetPoint p = new repriseProjetPoint(1, 1);
        System.out.println("Abcisse: " + p.getX());
        System.out.println("Ordonné: " + p.getY());
        System.out.println("Mon point: " + p.toString());
        repriseProjetPoint p2= new repriseProjetPoint(-2, 5);
        System.out.println("Mon point 2: " +p2.toString());
        System.out.println("Distance entre p1 et p2: " +p.distance(p2));

    }

}
