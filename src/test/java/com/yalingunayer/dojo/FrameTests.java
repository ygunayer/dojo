package com.yalingunayer.dojo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FrameTests {
    @Test
    public void frame_initialize_initializesWith0Score() {
        Frame frame = new Frame();
        Assert.assertEquals(0, frame.getScore());
    }

    @Test
    public void frame_simpleRollsTwice_shouldReturnProperScore() {
        Frame frame = new Frame();
        Roll roll = new Roll().attempt(3).attempt(4);

        frame.setRoll(roll);

        Assert.assertEquals(7, frame.getScore());
    }

    @Test
    public void frame_whenRollsCompleted_shouldBecomeClosed() {
        Frame frame = new Frame();
        Roll roll = new Roll().attempt(3).attempt(4);

        frame.setRoll(roll);

        Assert.assertFalse(frame.isOpen());
    }
}
