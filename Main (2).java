import java.util.Scanner;
/*
Program 3: Income Tax

This program should prompt the user to enter in their salary. 
The program will then determine the amount of income tax that they owe. 

The income tax amount should be determined using data from the Government of Canada tax brackets and rates.

https://www.canada.ca/en/revenue-agency/services/tax/individuals/frequently-asked-questions-individuals/canadian-income-tax-rates-individuals-current-previous-years.html

*/
class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
  
  // defines constants
    
  final int BASE_AMT = 155625;
  final double TAX_RATE = 0.29;
  final double BASE_TAX = 32180.11;
    
    
    
    //takes user input for income
  System.out.println("What is your income?");
  double income = keyboard.nextDouble();

  //calculates the amount of tax paid in that bracket
  double amount = income - BASE_AMT;
  double tax = amount * TAX_RATE;
  double finalTax = tax + BASE_TAX; 


  //print the total amount of tax paid
  System.out.println("The total amount tax is: $" + finalTax);
  
    
    
    keyboard.close();
  }
}