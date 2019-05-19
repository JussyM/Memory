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
public class Video {
    private String auteur;
    private boolean publier;
    private String titre;
    private int nbLikes;

    public String getAuteur() {
        return auteur;
    }
    
    
    public void liker(){
        nbLikes++;
    }
    public void publier(){
        publier=true;
    }
    public Video(String unAuteur, String unTitre){
        if(unAuteur==null|| unAuteur.length()==0){
            throw new IllegalArgumentException("Auteur invalide" + unAuteur); 
        }
        auteur= unAuteur;
        titre= unTitre;
        nbLikes=0;
        
    }
    public void getliker(){
        
    }
    public void getpublier(){
        
    }
    
    
}
