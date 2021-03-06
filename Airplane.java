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
public class Airplane {
    /**
    * The speed.
    */
    private final int speed;

    /**
    * The constructor for the Airplane class.
    */
    public Airplane() {
    }

    /**
    * Setter for the speed of an Airplane.
    *
    * @param newSpeed the new speed of an Airplane
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }

    /**
    * Getter for the speed of an Airplane.
    *
    * @return returns the current speed
    */
    public int getSpeed() {
        return speed;
    }
}
