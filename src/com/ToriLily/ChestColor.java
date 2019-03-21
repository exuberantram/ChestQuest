package com.ToriLily;

public enum ChestColor {
    blue ("Blue"),
    green ("Green"),
    red ("Red"),
    purple ("Purple"),
    black ("Black"),
    brown ("Brown");

    private final String color;

    ChestColor(String color){
        this.color = color;
    }
    String color() {
        return color;
    }
}
