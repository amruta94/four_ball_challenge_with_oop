package com.fourballchallenge;

import processing.core.PApplet;

public class BallThree implements Ball{
    private int diameterOfBall;
    private int speedOfBall;
    private int distanceFromTopOfFrame;
    private int distanceFromLeftOfFrame;
    private PApplet applet;

    public BallThree(){
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
        this.speedOfBall = 3 * speedOfBall;
    }

    @Override
    public void setDistanceFromTopOfFrame(int distanceFromTopOfFrame) {
        this.distanceFromTopOfFrame = 3 * distanceFromTopOfFrame;
    }


    @Override
    public void drawBall() {
        applet.ellipse(distanceFromLeftOfFrame,distanceFromTopOfFrame,diameterOfBall ,diameterOfBall);
        distanceFromLeftOfFrame = distanceFromLeftOfFrame + speedOfBall;
    }
}
