package rpg;

import java.util.Random;

public class Dice {

    public Random r;

    public Dice() {
        r = new Random();
    }

    public int roll() {
        return (r.nextInt(6) + 1);
    }
}
