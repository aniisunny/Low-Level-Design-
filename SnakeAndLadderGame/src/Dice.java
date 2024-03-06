package src;

import java.util.Random;

public class Dice {

    private static final int MAX_VALUE = 6;
    
    private int maxValue;

    public Dice() {
        this.maxValue = MAX_VALUE;
    }

    public Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    public int rollDice() {
        
        Random random = new Random();
        int value =  random.nextInt(maxValue) + 1;

        if (value == 6) {
            value += random.nextInt(maxValue) + 1;
        }

        if (value == 12) {
            value += random.nextInt(maxValue) + 1;
        }

        if (value == 18) {
            value = 0;
        }

        return value;
    }
}
