package G53554.DEV2;

/**
 *
 * @author justu
 */
public class MainMoment {
    public static void main(String[] args) {
        Moment moment1= new Moment(13, 01, 20);
        Moment moment2= new Moment(13, 1, 20);
        Moment moment3= new Moment(13, 05, 20);
        //System.out.println("L'heure du moment 1 est: " + moment1.toString());
        System.out.println(moment1.equals(moment3));
    }
}
