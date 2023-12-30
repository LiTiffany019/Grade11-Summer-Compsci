import java.util.Scanner;

/*
    Name: Tiffany Li
    Date: July 21 2022
    Purpose of program: To create a program that will validate data entered by the user and progress through different stages if the user input is valid

*/
class Main {
  public static void main(String[] args) {

    // define Scanner object
    Scanner keyboard = new Scanner(System.in);

    // define constants
    final int STAGE1 = 6;
    final String STAGE2A = "a";

    final int STAGE3FROM = 5;
    final int STAGE3TO = 15;
    final String STAGE3Z = "z";
    final String STAGE3ZUP = "Z";

    final int STAGE4FROM = 5;
    final int STAGE4TO = 500;

    final int POS = 0;
    final int DIVIDE = 2;
    final int ODD = 1;

    // define variables
    boolean valid = false;
    int value;
    int value2;
    int value3;
    int remainder;

    int stage = 1;
    /***************************
     * Stage 1: The user must enter a string that is greater
     * than 6 characters long.
     ***********************/

    // loop until the inputted value is true
    while (valid == false) {
      System.out.println("Stage " + stage);
      System.out.println("Enter a string that is greater than " + STAGE1 + " characters long.");
      System.out.println(""); // blank line

      String stage1string = keyboard.nextLine();// user input

      // if the length of the inputted value is greater than 6, end the loop and move
      // onto stage 2
      if (stage1string.length() > 6) {
        System.out.println("Stage 1 complete.");
        System.out.println("");// blank line
        valid = true;
        stage++;

      }

      // otherwise prompt the user to try again
      else {
        System.out.println("Invalid input, please try again.");
        System.out.println("");// blank line
      }
    }

    /***************************
     * Stage 2: The user must enter a string that contains
     * at least one lowercase “a”.
     ***********************/
    valid = false;// allows stage 2 to loop

    // loop until the inputted value is true
    while (valid == false) {
      System.out.println("Stage " + stage);
      System.out.println("Enter a string that contains at least one lowercase '" + STAGE2A + "'.");
      System.out.println(""); // blank line

      String stage2 = keyboard.nextLine();// user input

      // if the inputted value contains a lowercase 'a' then end the loop and move
      // onto stage 3
      if (stage2.contains(STAGE2A)) {
        System.out.println("Stage 2 complete.");
        System.out.println("");// blank line
        valid = true;
        stage++;
      }

      // otherwise prompt the user to try again
      else {
        System.out.println("Invalid input, please try again.");
        System.out.println("");// blank line
      }
    }

    /***************************
     * Stage 3: The user must enter a string that is between
     * 5 and 15 characters long, and does not contain the
     * letter “z”.
     ***********************/
    valid = false;// allows stage 3 to loop

    // loop until the inputted value is true
    while (valid == false) {
      System.out.println("Stage " + stage);
      System.out.println("Enter a string that is between " + STAGE3FROM + " and " + STAGE3TO
          + " characters long that does NOT contain the letter '" + STAGE3Z + "'.");
      System.out.println(""); // blank line

      String stage3 = keyboard.nextLine();// user input

      // if the length of the inputted value is between 5 and 15 and does not contain
      // the letter 'z', end the loop and move onto stage 4
      if (stage3.length() >= STAGE3FROM && stage3.length() <= STAGE3TO) {

        // if the inputted value contains the letter 'z', prompt the user to try again
        if (stage3.contains(STAGE3Z) || stage3.contains(STAGE3ZUP)) {
          System.out.println("Invalid input, please try again.");
          System.out.println("");// blank line

        }

        // otherwise end the loop and continue onto the next stage
        else {
          System.out.println("Stage 3 complete.");
          System.out.println("");// blank line
          valid = true;
          stage++;
        }
      }
      
        // otherwise prompt the user to try again
      else {
        System.out.println("Invalid input, please try again.");
        System.out.println("");// blank line
      }
    }

    /***************************
     * Stage 4: The user must enter an integer between 5 and 500.
     ***********************/
    valid = false;// allows stage 4 to loop

    // loop until the inputted value is true
    while (valid == false) {
      System.out.println("Stage " + stage);
      System.out.println("Enter an integer between " + STAGE4FROM + " and " + STAGE4TO + ".");
      System.out.println("");// blank line

      String stage4 = keyboard.nextLine();// input

      // try to convert the inputted string to an integer
      try {
        value = Integer.parseInt(stage4);

        // if the value is between 5 and 500, end the loop and continue onto stage 5
        if (value >= STAGE4FROM && value <= STAGE4TO) {
          System.out.println("Stage 4 complete.");
          System.out.println("");// blank line
          valid = true;
          stage++;
        }

        // otherwise prompt the user to try again
        else {
          System.out.println("Invalid input, please try again.");
          System.out.println("");// blank line
        }
      }

      // if the inputted string cannot be converted to an integer, catch the error and
      // continue looping until valid is true
      catch (NumberFormatException e) {
        System.out.println("Invalid input, please try again.");
        System.out.println("");// blank line
      }
    }

    /***************************
     * Stage 5: The user must enter a negative integer.
     ***********************/
    valid = false;// allows stage 5 to loop

    // loop until the inputted value is true
    while (valid == false) {
      System.out.println("Stage " + stage);
      System.out.println("Enter a negative integer.");
      System.out.println("");// blank line

      String stage5 = keyboard.nextLine();// input

      // try to convert the inputted string into an integer
      try {
        value2 = Integer.parseInt(stage5);

        // if the value is less than 0, end the loop and continue onto the next stage
        if (value2 < POS) {
          System.out.println("Stage 5 complete.");
          System.out.println("");// blank line
          valid = true;
          stage++;

        }

        // otherwise prompt the user to try again
        else {
          System.out.println("Invalid input, please try again.");
          System.out.println("");// blank line
        }
      }

      //if the inputted string cannot be converted to an integer, catch the error and loop again until valid is true
      catch (NumberFormatException e) {
        System.out.println("Invalid input, please try again.");
        System.out.println("");// blank line
      }
    }

    /***************************
     * Stage 6: The user must enter a positive, odd integer.
     ***********************/
    valid = false;// allows stage 6 to loop

    
    //loop until valid is true
    while (valid == false) {
      System.out.println("Stage " + stage);
      System.out.println("Enter an odd, positive integer.");
      System.out.println("");//blank line
      
      String stage6 = keyboard.nextLine();//input

      // try to convert the inputted string to an integer
      try {
        value3 = Integer.parseInt(stage6);

        remainder = value3 % DIVIDE;//divides the inputted value by 2 and leaves a remainder

        //if the remainder is 1, the integer is odd therefore the loop ends
        if (remainder == ODD) {
          System.out.println("Stage 6 complete.");
          System.out.println("");// blank line
          valid = true;
        }
        // otherwise prompt the user to try again
        else {
          System.out.println("Invalid input, please try again.");
          System.out.println("");// blank line
        }
      }

      //if the inputted string cannot be converted to an integer, catch it and
      catch (NumberFormatException e) {
        System.out.println("Invalid input, please try again.");
        System.out.println("");// blank line
      }
    }

    // Output congratulatory message here //
    System.out.println("Congratulations, you made it through all the stages!");
  
    keyboard.close();
  }
}