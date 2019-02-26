package G53554.DEV2;

/**
 *
 * @author justu
 */
public class Moment {

    private int hour;
    private int minute;
    private int second;

    /**
     * Le constructeur
     *
     * @param hour
     * @param minute
     * @param second
     */
    public Moment(int hour, int minute, int second) {
        if ((hour >= 0) && (hour >= 23)) {
            throw new IllegalArgumentException("L'heure doit être compris entre 0 et 23");
        }
        if ((minute >= 0) && (minute >= 59)) {
            throw new IllegalArgumentException("La minute est compris entre 0 et 59");
        }
        if ((second >= 0) && (second >= 59)) {
            throw new IllegalArgumentException("La seconde est comprise entre 0 et 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Récupère la valeur de hour
     *
     * @return hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Récupère la valeur de minute
     *
     * @return minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * récupère la valeur de seconde
     *
     * @return seconde
     */
    public int getSecond() {
        return second;
    }

    /**
     * Affiche les valeurs de heure minute et seconde
     *
     * @return l'heure en intégralité
     */
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    /**
     *
     * @param other
     * @return
     */

    public boolean equals(Moment other) {
        boolean equals=false;
        if(other.hour==this.hour && other.minute== this.minute && other.second== this.second){
            equals=true; 
        }
        return equals;
    }

    public Moment() {
        
    }

   
    

}
