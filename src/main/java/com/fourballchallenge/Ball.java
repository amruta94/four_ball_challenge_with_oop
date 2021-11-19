package com.fourballchallenge;

import processing.core.PApplet;

public interface Ball {
    void setPApplet(PApplet applet);
    void setDiameterOfBall(int diameterOfBall);
    void setSpeedOfBall(int speedOfBall);
    void setDistanceFromTopOfFrame(int distanceFromTopOfFrame);
    void drawBall();
}
