import java.util.Random;
import java.util.Scanner;

/* 
Name: Tiffany Li
Date: July 20, 2022
Purpose: To develop software using the knowledged learned thus far
*/

class Main {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);

    // array to hold the rolls
    int rolls[];
    rolls = roll();
    
    //variables and constants
    final int TOTALROLLS = 5;
    int timesRolled = 1;
    int gameEnd = 100;

    //introduce the game 
    printIntro();
    System.out.println("You have " + TOTALROLLS + "/" + TOTALROLLS + " rolls remaining.");

    //loop the rolling process 
    for (int i = 0 ; i < TOTALROLLS ; i++){
      String toRoll = keyboard.nextLine();//input
      
      if (toRoll.equals("r")) {//if the input equals 'r'
        System.out.println("You rolled a " + rolls[i] + "!");//output the number rolled

        //call checkRoll method to check what the value rolled does and output the points
        checkRoll(rolls[i]);
        
        //end the game if checkWinLose method returns true
        boolean checkGameEnd = checkWinLose(i);
        if (checkGameEnd == true) {
          i = gameEnd;//end loop by failing the loop condition
        }

        //otherwise if the checkGameEnd boolean is false, continue the game and output prompt and rolls remaining
        else {
          //restate the roll prompt
          System.out.println("Press 'r' to roll!");
          //calculate and output the remaining number of rolls the player has left
          int rollsRemain = TOTALROLLS - timesRolled;
          System.out.println("Rolls remaining: " + rollsRemain + "/" + TOTALROLLS);
          timesRolled++;
        }
      }

      //if the player enters a string value that is not 'r'
      else {
        System.out.println("Please press 'r' to roll.");
        i--;
      }

    }//end of loop

    keyboard.close();
    
  }//main class ends here
  
  ////////////////////////////////////////////////////////////////////////////////////////////
  
  ////////////////////////////////////////////////////////////////////////////////////////////

  //constants for the checkRoll method
  final static int ROLL1 = 111;
  final static int ROLL2 = 2;
  final static int ROLL3 = 30;
  final static int ROLL4 = 40;
  final static int ROLL5FROM = 1;//random value from this constant - 
  final static int ROLL5TO = 150;//- to this constant
  final static int ROLL6 = 20;

  //constants for the roll method
  final static int ROLLFROM = 1;
  final static int ROLLTO = 6;

  
  //methods

  /*
    Method: printIntro
    Parameters: none
    Return: void
    Prints the introduction to the program and explains the rules
  */
  public static void printIntro() {
    System.out.println("Welcome to the RNG Dice Game!");
    System.out.println("The rules are as follows: ");
    System.out.println("");//blank line

    //rules 
    System.out.println("The objective of the game is to get 200 or more points in under 5 rolls or less.");
    System.out.println("If you don't have any more remaining points or your points go into the negatives, you lose automatically.");
    System.out.println("Fear not as you start with 50 entire points! ");
    System.out.println("Each number rolled means something different, some will give you more points, and some will deduct them. ");
    System.out.println("Below are the results of rolling a certain number:");

    //roll outcomes and what they do:
    System.out.println("");//blank line
    System.out.println(" - Rolling a '1' will give you " + ROLL1 + " points");
    System.out.println(" - Rolling a '2' will divide all your current points by " + ROLL2 + " without leaving a remainder");
    System.out.println(" - Rolling a '3' will summon the Tooth Fairy. You'll either gain " + ROLL3 + " points or lose " + ROLL3 + " points. There's also a chance nothing will happen" );
    System.out.println(" - Rolling a '4' will subtract " + ROLL4 + " from your total points");
    System.out.println(" - Rolling a '5' will add a random number between " + ROLL5FROM + " to " + ROLL5TO + " to your total points");
    System.out.println(" - Rolling a '6' will give cost you a lunch at Jollibees? Well anyway it'll cost you " + ROLL6 + " points for it.");

    //final part of the intro
    System.out.println("");//blank line
    System.out.println("Are you ready? Press 'r' to roll!");
    System.out.println("");//blank line
  }

  //////////////////////////////////////////////////////////////////////////
  /*
    Method: random5
    Parameters: none
    Return: int: a random value between ROLL5FROM and ROLL5TO
    This method is for the random number needed when the value 5 is rolled
  */
  public static int random5() {
    Random rand = new Random();
    int num = rand.nextInt(ROLL5TO) + ROLL5FROM;
    System.out.println("");
    return num;
    
  }

  //////////////////////////////////////////////////////////////////////////
  /*
    Method: roll
    Parameters: none
    Return: an array with random values between ROLLFROM and ROLLTO
  */
  //variables and constants for rolls method
  final static int ARLENGTH = 5;
  static int i = 0;
  
  //roll method 
  public static int[] roll() {
    
    //array where the dice results go
    int [] rolls = new int [ARLENGTH];
    
    //loop to store each roll into the rolls array
    for (int i = 0 ; i < rolls.length ; i++) {
      Random rand = new Random();
      int num = rand.nextInt(ROLLTO) + ROLLFROM;//random number from 1-6
      rolls [i] = num;
    } 
    
    return rolls;
  }

  //////////////////////////////////////////////////////////////////////////
  /*
    Method: checkRoll
    Parameters: one int
    Return: the number of points 
    This method checks the value rolled and calculates the final amount of points
  */
  //variables for checkRoll  method
  static int points = 50;
  static int toothFairy1 = 2;
  static int toothFairy2 = 1;

  //array to store the roll outcomes (it just stores the numbers that can be rolled - 1-6)
  static int [] rollNums = {1, 2, 3, 4, 5, 6};
  
  //checkRoll method
  public static int checkRoll(int index) {
      
    //if else statements to check the value of each roll
    if (index == rollNums[0] ) {
      points = points + ROLL1;
      System.out.println("You gained " + ROLL1 + " points! You now have " + points + " points.");
    }
  
    else if (index == rollNums[1]) {
      points = points / ROLL2;
      System.out.println("All your points have been divided by " + ROLL2 + "! Unfortunately, the remainder will not be included. You now have " + points + " points.");
    }
  
    //randomly generates a number to determine how the Tooth Fairy will be affect the points
    else if (index == rollNums[2]) {
      Random rand = new Random();
      int choice = rand.nextInt(toothFairy1) + toothFairy2; 

      //checks that randomly generated number and performs different tasks according to that number 
      if (choice == 1) {
        points = points - ROLL3;
        System.out.println("Oh no! Looks like the Tooth Fairy took " + ROLL3 + " points from you. You now have " + points + " points. ");
      }
  
      else if (choice == 2) {
        System.out.println("The Tooth Fairy seems to have forgotten about you and nothing happened to your points. You have " + points + " points. ");
      }
  
      else if (choice == 3) {
        points = points + ROLL3;
        System.out.println("The Tooth Fairy seems to be in a good mood! You gained " + ROLL3 + " points! You now have " + points + " points.");
      }
      
    }
  
    else if (index == rollNums[3]) {
      points = points - ROLL4;
      System.out.println("Oh no! Looks like you lost " + ROLL4 + " points! You now have " + points + " points remaining");
    }
  
    else if (index == rollNums[4]) {
      Random rand = new Random();
      int num = rand.nextInt(ROLL5TO) + ROLL5FROM;
      points = points + num;
      System.out.println("A random number between " + ROLL5FROM + " and " + ROLL5TO + " has been added to your points! You gained " + num + " points and now have " + points + " points. ");
    }
    
    else if (index == rollNums[5]) {
      points = points - ROLL6;
      System.out.println("Thanks for the meal! You spent " + ROLL6 + " points and now have " + points + " left");
    }

    return points;
  }  

  
  //////////////////////////////////////////////////////////////////////////
  /*
    Method: checkWinLose
    Parameters: one int
    Return: boolean
    This method checks whether or not the player has won or lost
  */
  //variables for checkWinLose method
  static int win = 200;
  static int lose = 0;
  static int loseRoll = 4;
  
  //checkWinlose method
  public static boolean checkWinLose(int timesRolled) {
    //if points reach 200+
    if (points >= win) {
      System.out.println("");//blank line
      System.out.println("You reached " + win + " points! Congratulations, you beat the RNG Dice Game! Thank you for playing.");
      return true;
    }

    //if points drop to zero or below
    else if (points <= lose) {
      System.out.println("");//blank line
      System.out.println("You don't have any more points! You lose the RNG Dice Game! Thank you for playing.");
      return true;
    }

    //if the player doesn't get 200+ points or below 0 points by the end of all their rolls
    else if (timesRolled >= loseRoll) {
      System.out.println("");//blank line
      System.out.println("You've run out of rolls! You lose the RNG Dice Game! Thanks for playing.");
      return true;
    }

    else {
      return false;
    }
  }

}