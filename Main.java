import java.util.Scanner;
/*
Program 1: Water and Computer Manufacturing

Did you know that it takes 1.5 tons of water to manufacture one computer and monitor combo? Create a computer program that prompts the user to enter the number of computer/monitor combos they own. The program should then calculate and output the total number of tons of water used to manufacture them.
*/
class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    // define one constant
    final double WATER = 1.5;
    
    // define necessary variables (2 variables)
    int combos;
    double totalWater;
    
    // initialize variables
     
     
    
    // get input from user and store in a variable
    System.out.println("Enter the number of computer / monitor combos:");
    combos = keyboard.nextInt();
    
    
    // calculate the total number of tons of water 
    // store in a variable
    totalWater = WATER * combos;

    // output the value
    System.out.println("The total number of tons of water used is " + totalWater);

    keyboard.close();
  }
}