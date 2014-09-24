package com.hangman.players;

import com.hangman.FakeGame;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class YourPlayerTest {

    YourPlayer player;

    @Before
    public void init() {
        player = new YourPlayer();
    }

    @Test
    public void AlwaysGuessA() {

        char guess = player.GetGuess(Arrays.asList('a', 'b', 'c'));

        assertEquals('a', guess);
    }

    @Test
    public void HowManyLettersMissing() {
        int missing = player.lettersMissing(Arrays.asList('_','_','a','_'));

        assertEquals(3,missing);
    }

    @Test
    public void DidAGuessSucceed() {

        player.GetGuess(Arrays.asList('_', '_', '_'));

        player.GetGuess(Arrays.asList('a', '_', '_'));

        boolean success = player.validLetter('a');

        assertEquals(true, success);
    }

}
