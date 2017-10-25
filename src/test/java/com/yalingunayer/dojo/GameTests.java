package com.yalingunayer.dojo;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GameTests {
    @Test
    public void game_initialize_initializesWith10OpenFrames() {
        Game game = new Game();
        List<Frame> frames = game.getFrames();

        List<Frame> openFrames = frames.stream().filter(frame -> frame.isOpen()).collect(Collectors.toList());

        Assert.assertEquals(10, frames.size());
        Assert.assertEquals(10, openFrames.size());
        Assert.assertFalse(game.isFinished());
    }

    @Test
    public void game_with10SimpleRolls_shouldFinish() {
        Game game = new Game();

        for (int i = 0; i < 10; i++) {
            Roll roll = new Roll().attempt(3).attempt(4);
            game.getFrames().get(i).setRoll(roll);
        }

        Assert.assertTrue(game.isFinished());
    }
}
