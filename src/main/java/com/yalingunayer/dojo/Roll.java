package com.yalingunayer.dojo;

public class Roll {

    private int totalAttempts = 0;
    private int[] attempts = new int[3];

    public Roll attempt(int roll) {
        attempts[totalAttempts] = roll;
        totalAttempts++;

        // TODO test this
        if (totalAttempts >= 2) {
            throw new RuntimeException("ats2");
        }

        return this;
    }

    public int getScore() {
        int total = 0;
        for (int i = 0; i < attempts.length; i++) {
            total += attempts[i];
        }
        return total;
    }

    public boolean isStrike() {
        return attempts[0] == 10;
    }

}
