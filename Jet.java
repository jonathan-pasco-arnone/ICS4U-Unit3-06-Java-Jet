/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This is the class that contains many functions.
*/
public class Jet extends Airplane {
    /**
    * The multiplier for the speed.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Calls the constructor of Airplane, Jet's superclass.
    */
    public Jet() {
    }

    /**
    * Setter for the speed of a Jet.
    *
    * @param speed the new speed that the jet will use
    */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * Accelerates the speed of the jet.
    */
    public void accelerate() {
        super.setSpeed(super.getSpeed() * 2);
    }
}
