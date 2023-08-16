package com.greeshma.GameRunner;

import com.greeshma.GameRunner.game.GameRunner;
import com.greeshma.GameRunner.game.MarioGame;

public class AppGamingMain {
    public static void main(String[] args)
    {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
