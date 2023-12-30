import java.util.Scanner;
/*
Program 2: Shopping!

This program should prompt the user for the number of USB storage devices they would like to purchase, the number of keyboards they would like to purchase, and the number of computer mice they would like to purchase. The program should then calculate and output a subtotal for their order, the amount of taxes, and grand total based on the following prices:

    USB storage device: $19.99
    Keyboard: $49.99
    Computer Mouse: $25.99
    Hint: There is a video in this activity that takes you 
        through the creation of a program very similar to this.
*/ 

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

  //defines the constants of the price of items 
  final double USB_COST = 19.99;
  final double KEYBOARD_COST = 49.99;
  final double MOUSE_COST = 25.99;
  
    
  //these lines ask how many of each item they want and revieves input
  System.out.println("How many USB storage devices would you like to buy?");
  int usbs = keyboard.nextInt();

  System.out.println("How many keyboards would you like to buy?");
  int keyboards = keyboard.nextInt();

  System.out.println("How many computer mice would you like to buy?");
  int mice = keyboard.nextInt();


  //define the amount of tax

  final double HST = 1.13; 
  
  //this part does the calculations
    
  double subtotal = (usbs * USB_COST) + (keyboards * KEYBOARD_COST) + (mice * MOUSE_COST) ;
  double total = subtotal * HST;

  //print out the final price

  System.out.println("The total cost is $" +  total);

    
    keyboard.close();
  }
}