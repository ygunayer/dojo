package com.yalingunayer.dojo;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames;

    public Game() {
        frames = new ArrayList<Frame>();
        for (int i = 0; i < 10; i++) {
            frames.add(new Frame());
        }
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public boolean isFinished() {
        return !frames.stream().anyMatch(frame -> frame.isOpen());
    }

}
