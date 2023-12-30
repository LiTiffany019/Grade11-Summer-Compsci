import java.util.Scanner;

/*
    Name: Tiffany Li
    Date: July 13, 2022
    Purpose of the program: Putting into practice, loops 
*/

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //define variable for user input
    int choice;

    //introduction
    System.out.println("Welcome to the Cool Counting Program");
    System.out.println("");//blank line

    //instructions and options to choose from
    System.out.println("Please enter the number that corresponds to the choice of counting you would like to choose:");
    System.out.println("1) Count from 0 to 10 by 1");
    System.out.println("2) Count from 100 to 0 by 10");
    System.out.println("3) Count from 50 to 500 by 50");
    System.out.println("4) Count from 6000 to 1000 by 1000");
    
    System.out.println("-----------------------------------------------");//separation line for organization 
    
    
    choice = keyboard.nextInt();//receive user input

    //choice 1
    if (choice == 1) {
    System.out.println("You have chosen to count from 0 to 10 by 1");
    System.out.println("");//blank line
    for (int i = 0; i <= 10; i = i + 1) {
      System.out.println(i);
    }
  }

    //choice 2
    else if (choice == 2) {
      System.out.println("You have chosen to count from 100 to 0 by 10");
      System.out.println("");//blank line
      for (int i = 100; i >= 0; i = i - 10) {
        System.out.println(i);
      }
    }
    
    //choice 3
    else if (choice == 3) {
      System.out.println("You have chosen to count from 50 to 500 by 50");
      System.out.println("");//blank line
      for (int i = 50; i <= 500; i = i + 50) {
        System.out.println(i);
      }
    }

    //choice 4 
    else if (choice == 4) {
      System.out.println("You have chosen to count from 6000 to 1000 by 1000");
      System.out.println("");//blank line
      for (int i = 6000; i >= 1000; i = i - 1000) {
        System.out.println(i);
      }
    }

    keyboard.close();
  }
}