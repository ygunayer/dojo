package com.yalingunayer.dojo;

public class Frame {

    private Roll roll;
    private int score;
    private boolean isOpen;

    public Frame() {
        this.score = 0;
        this.isOpen = true;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public int getScore() {
        return this.score;
    }

    public Roll getRoll() {
        return roll;
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
        this.score = roll.getScore();
        this.isOpen = false;
    }

}
