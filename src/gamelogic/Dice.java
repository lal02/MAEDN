package gamelogic;

import java.util.Random;

//throws a dice
public class Dice {

    public int rollTheDice(){
        return new Random().nextInt(1,7);
    }
}
