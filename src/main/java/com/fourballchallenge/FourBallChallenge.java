package com.fourballchallenge;

import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int WIDTH_OF_FRAME = 640;
    public static final int HEIGHT_OF_FRAME = 480;
    public static final int DIAMETER_OF_BALL = 10;
    public static final int SPEED_OF_BALL = 1;
    private int distanceBetweenBalls;
    private Ball ballOne,ballTwo,ballThree,ballFour;

    public FourBallChallenge() {
        super();
    }

    public static void main(String[] args) {
        PApplet.main("com.fourballchallenge.FourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH_OF_FRAME, HEIGHT_OF_FRAME);
    }

    @Override
    public void setup() {
        distanceBetweenBalls = HEIGHT_OF_FRAME / 5;
        ballOne = new BallOne();
        setUpBall(ballOne);

        ballTwo = new BallTwo();
        setUpBall(ballTwo);

        ballThree = new BallThree();
        setUpBall(ballThree);

        ballFour = new BallFour();
        setUpBall(ballFour);
    }

    private void setUpBall(Ball ball) {
        ball.setPApplet(this);
        ball.setDiameterOfBall(DIAMETER_OF_BALL);
        ball.setSpeedOfBall(SPEED_OF_BALL);
        ball.setDistanceFromTopOfFrame(distanceBetweenBalls);
    }

    @Override
    public void draw() {
        ballOne.drawBall();
        ballTwo.drawBall();
        ballThree.drawBall();
        ballFour.drawBall();
    }
}