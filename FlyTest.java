/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This program uses a custom class.
*/
final class FlyTest {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        final int twoTwelve = 212;
        final int fourTwentyTwo = 422;
        final int four = 4;
        final int fiveThousand = 5000;

        final Airplane biplane = new Airplane();
        biplane.setSpeed(twoTwelve);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(fourTwentyTwo);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < four) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > fiveThousand) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
