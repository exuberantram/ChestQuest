package com.ToriLily;

// a class to accompany Enum ChestColor to print the color statement and determine which color is in ChestGen
public class ColorChoice {
    ChestColor color;

    public ColorChoice(ChestColor chestColor) {
        this.color = chestColor;
    }

    // switch statement prints the color choice back to the user. will add more functionality soon.
    public void stateChoice() {
        switch (color) {
            case red:
                System.out.println("You chose the red chest.");
                break;
            case blue:
                System.out.println("You chose the blue chest.");
                break;
            case black:
                System.out.println("You chose the black chest.");
                break;
            case brown:
                System.out.println("You chose the brown chest.");
                break;
            case green:
                System.out.println("You chose the green chest.");
                break;
            case purple:
                System.out.println("You chose the purple chest.");
        }
    }

    public ChestColor getColor() {
        return color;
    }

    public void setColor(ChestColor color) {
        this.color = color;
    }
}
