package com.fourballchallenge;

import processing.core.PApplet;

public class BallTwo implements Ball{
    private int diameterOfBall;
    private int speedOfBall;
    private int distanceFromTopOfFrame;
    private int distanceFromLeftOfFrame;
    private PApplet applet;

    public BallTwo(){
        this.distanceFromLeftOfFrame = 0;
    }

    @Override
    public void setPApplet(PApplet applet) {
        this.applet = applet;
    }

    @Override
    public void setDiameterOfBall(int diameterOfBall) {
        this.diameterOfBall = diameterOfBall;
    }

    @Override
    public void setSpeedOfBall(int speedOfBall) {
        this.speedOfBall = 2 * speedOfBall;
    }

    @Override
    public void setDistanceFromTopOfFrame(int distanceFromTopOfFrame) {
        this.distanceFromTopOfFrame = 2 * distanceFromTopOfFrame;
    }


    @Override
    public void drawBall() {
        applet.ellipse(distanceFromLeftOfFrame,distanceFromTopOfFrame,diameterOfBall ,diameterOfBall);
        distanceFromLeftOfFrame = distanceFromLeftOfFrame + speedOfBall;
    }
}
