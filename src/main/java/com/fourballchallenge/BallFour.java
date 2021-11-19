package com.fourballchallenge;

import processing.core.PApplet;

public class BallFour implements Ball{
    private int diameterOfBall;
    private int speedOfBall;
    private int distanceFromTopOfFrame;
    private int distanceFromLeftOfFrame;
    private PApplet applet;

    public BallFour(){
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
        this.speedOfBall = 4 * speedOfBall;
    }

    @Override
    public void setDistanceFromTopOfFrame(int distanceFromTopOfFrame) {
        this.distanceFromTopOfFrame = 4 * distanceFromTopOfFrame;
    }


    @Override
    public void drawBall() {
        applet.ellipse(distanceFromLeftOfFrame,distanceFromTopOfFrame,diameterOfBall ,diameterOfBall);
        distanceFromLeftOfFrame = distanceFromLeftOfFrame + speedOfBall;
    }
}
