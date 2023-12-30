import java.util.Scanner;

/*
    Name:  Tiffany Li
    Date:  July 13 2022
    Purpose of the program: To create a program that can find the value of a number squared, cubed, or raised to any power
*/

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //declare variables
    int choice;
    double numSqd;
    double numCbd;
    double baseNum;
    double exponent;

    double answer1;
    double answer2;
    double answer3 = 1;//this variable is initialized here for the math later on
    
    do //will prompt the user at least once before the program stops 
    {

      //lines to make the output look more organized
      System.out.println("-----------------------------------------------");
      System.out.println("");
      
      //introduction to the program
      System.out.println("Welcome to the Squares, Cubes and Powers Program");
      System.out.println("");//blank line
      System.out.println("The number you enter corresponds to the action you would like to perform." );
      System.out.println("Please choose one of the following:");
    
      
      //user menu
      System.out.println("");//blank line
      System.out.println("1) Find the value of a number squared");
      System.out.println("2) Find the value of a number cubed");
      System.out.println("3) Find the value of a number, to any power");
      System.out.println("4) Exit the program");

      //receive user input
      choice = keyboard.nextInt(); 

    //choice #1
    if (choice == 1){
      //intructions 
      System.out.println("Please enter the number you would like squared:");

      //receive user input
      numSqd = keyboard.nextDouble();
      
      answer1 = numSqd * numSqd;//raised the inputed number to the power of 2 (squares it)
      System.out.println(numSqd + " squared is " + answer1);
       
    }

    //choice #2  
    else if (choice == 2){
      //intructions
      System.out.println("Please enter the number you would like cubed:");

      //receive user input
      numCbd = keyboard.nextDouble();

      answer2 = numCbd * numCbd * numCbd;//cubes the inputed number
      System.out.println(numCbd + " cubed is " + answer2);
      
    }

    //choice #3
    else if (choice == 3){
    //intructions
    System.out.println("Please enter a base number:");
    baseNum = keyboard.nextDouble();//inputs base number

    System.out.println("Please enter the exponent value:");
    exponent = keyboard.nextDouble();//inputs value of exponent

    System.out.println("");//blank line

    //loops to calculate base raised to the exponent 
    for (int i = 1; i <= exponent; i++){

      answer3 = answer3 * baseNum;//is looped until the base number is multiplied to itself exponent number of times
      
    }
    System.out.println(baseNum + " raised to the power of " + exponent + " is " + answer3);
    answer3 = 1;//resets the value back to 1 so that the previous value won't affect the loop
    }

      System.out.println("");//blank line
    
    } while (choice == 1 || choice == 2 || choice == 3); //will only loop if choice 4 is NOT chosen
  
    if (choice == 4) {
    System.out.println("Thank you for using the Squared, Cubes, and Powers Program, goodbye.");
    }
    
   keyboard.close();
  }
}