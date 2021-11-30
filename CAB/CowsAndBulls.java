package CAB;

import static java.lang.String.valueOf;

import java.util.Objects;
import java.util.Random;

public class CowsAndBulls {
  private String secretCode;
  private String gameStatus;
  private int numberOfGuesses;
  private Random random;

  public CowsAndBulls() {
    Random random = new Random();
    secretCode = valueOf((random.nextInt(9000) + 1000));
    gameStatus = "playing";
    numberOfGuesses = 1;
  }

  public String guess(String guess) {
    int numberOfBulls = searchForBulls(secretCode, guess);
    int numberOfCows = searchForCows(secretCode, guess);
    numberOfGuesses += 1;
    String guessResult = numberOfBulls + " bulls and " + numberOfCows + " cows";
    if (numberOfBulls == 4) {
      this.gameStatus = "finished";
      return guessResult;
    }
    return guessResult;

  }

  private int searchForBulls(String secretCode, String guess) {
    int result = 0;
    for (int i = 0; i < 4; i++) {
      if (secretCode.charAt(i) == guess.charAt(i)) {
        result += 1;
      }
    }
    return result;
  }

  private int searchForCows(String secretCode, String guess) {
    int result = 0;
    for (int i = 0; i < 4; i++) {
      if (secretCode.indexOf(guess.charAt(i)) > -1 &&
          secretCode.charAt(i) != guess.charAt(i)) {
        result += 1;
      }
    }
    return result;
  }

  public String getGameStatus() {
    return gameStatus;
  }

  public int getNumberOfGuesses() {
    return numberOfGuesses;
  }
}
