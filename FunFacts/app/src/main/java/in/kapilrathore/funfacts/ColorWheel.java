package in.kapilrathore.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by kapilrathore on 19/08/15.
 */
public class ColorWheel {

    String[] mColorArray = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {

        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColorArray.length);

        color = mColorArray[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}