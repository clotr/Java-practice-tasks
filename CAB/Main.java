package CAB;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CowsAndBulls cab = new CowsAndBulls();
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Cows And Bulls Game!");
    System.out.println(
        "You should find out the secret code by entering a 4 digit number in the range 1000-9999");
    System.out.println("Number of bulls mean the right number(s) in the right place.");
    System.out.println("Number of cows mean the right number(s) in the wrong place.");


    while (cab.getGameStatus() != "finished") {
      System.out.println(
          "Please enter your " + cab.getNumberOfGuesses() + ". guess!");
      String guess = input.nextLine();
      System.out.println(cab.guess(guess));
    }
    System.out.println("Congratulations! You have successfully found out the secret code in " +
        cab.getNumberOfGuesses() + " guesses!");
  }
}