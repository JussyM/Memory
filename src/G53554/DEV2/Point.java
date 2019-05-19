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
public class Point {
  private double x;
  private double y;
  /**
   * 
   * Elle affiche la classe Point 
   */
  public void display(){
      
      
  }
  /**
   *  Elle retourne l'absbisse entré en paramètre
   * @return X
   */
  public double getX(){
      return x;
  }
  /**
   * Elle retourne l'ordonnée y 
   * @return y
   */
  public double getY(){
      return y;
  }
  /**
   * Cette méthode est un constructeur elle construit x et y
   * @param x
   * @param y 
   */
  public Point(double x, double y){
      this.x=x;
      this.y=y;
  }
  /**
   * Déplacer le point 
   * @param deltaX
   * @param deltaY 
   */
  public void move(double deltaX, double deltaY){
      this.x +=deltaX; //incrémenter a +=b a= a+b
      this.y += deltaY;
  }
  /**
   * La distance entre deux points
   * @param P
   * @return la distance 
   */
  public double Distance(Point P){
     return Math.sqrt(Math.pow(P.x-this.x,-2)+ Math.pow(P.y-this.y,- 2));
  }
  @Override
  public String toString(){
     return "("+ x + "," + y + ")";
      
  }
  
}
