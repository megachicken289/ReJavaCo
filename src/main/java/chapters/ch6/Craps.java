package chapters.ch6;

import java.security.SecureRandom;

public class Craps
{
    private static final SecureRandom randNumbs = new SecureRandom();

    // enum to represent the game status
    private enum Status { CONTINUE, WON, LOST };

   // plays one game
   public static void main(String[] args) {
       int myPoint = 0; // point if no win or lose on first roll

       int sumOfDice = rollDice();

       // determine game status and point based on first roll

   }
}
