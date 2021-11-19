package com.fourballchallenge;

import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int WIDTH_OF_FRAME = 640;
    public static final int HEIGHT_OF_FRAME = 480;

    public static void main(String[] args) {
        PApplet.main("com.fourballchallenge.FourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH_OF_FRAME, HEIGHT_OF_FRAME);
    }
}