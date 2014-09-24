package com.hangman.players;
import com.hangman.Game;
import com.hangman.HangmanGame;
import com.hangman.Player;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class YourPlayer implements Player {

    private List<Character> myGuesses = new LinkedList<Character>();
    private List<Character> clue;

  @Override
  public char GetGuess(List<Character> clue) {
      this.clue = clue;
      int missing =  lettersMissing(clue);

      if (myGuesses.size() == 0 ) {
          myGuesses.add('a');
          return 'a';
      }

      return 'e';

  }

    public int lettersMissing(List<Character> clue ) {
        int letters = 0;
        for (char missing: clue ) {
            letters += (missing == '_')?1:0;
        }

        return letters;

    }

    public boolean validLetter( char letter ) {
        return this.clue.contains( letter );
    }

}
