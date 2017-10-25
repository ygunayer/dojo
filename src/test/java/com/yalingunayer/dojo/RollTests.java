package com.yalingunayer.dojo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RollTests {
    @Test
    public void roll_with10inFirstAttempt_shouldBeAStrike() {
        Roll roll = new Roll().attempt(10);
        Assert.assertTrue(roll.isStrike());
    }

}
