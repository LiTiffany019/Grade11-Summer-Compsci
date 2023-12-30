import java.util.Scanner;

/*
  Name: Tiffany Li
  Date: July 14, 2022
  Purpose of the Program:To demonstrate learned knowledge of variables, constants, loops, and arrays
*/

class Main {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);

    //declare variables and constants
    final int IND = 10;//short for index -- number of index values
    final int MULTIPLY = 3;
    int tenNums = 0;//to let the user know which number they are entering
    int sum = 0;

   //introduce the program 
    System.out.println("This program is designed to multiply any " + IND + "numbers that you enter by " + MULTIPLY + "as well as to find the sum of the numbers you entered");
    System.out.println("Please enter " + IND + " numbers you would like to be multiplied by " + MULTIPLY);
    
    //array for base numbers
    int [] baseNum = new int [IND];
    
    //loop to receive and store inputted numbers
    for (int i = 0; i < baseNum.length; i++) {

      tenNums = tenNums + 1;//numbers to lets the user know how many values they are entering
      System.out.print("Enter num " + tenNums + ": "); //prompts the user for a number
      baseNum[i] = keyboard.nextInt();//the inputted value is stored in the baseNum array

    }

    tenNums = 0; //reset the variable to 0
    System.out.println("");//blank line
    System.out.println("The numbers you entered multiplied by 3 are: ");

    //array for products
    int [] products = new int [IND];
    
    //loop to find the product and store it in another array
    for (int i = 0; i < baseNum.length; i++){
      products [i] = baseNum[i] * MULTIPLY;//calculates product for each element in the products array
      tenNums++;
      System.out.println(tenNums + ": " + products[i]);
    }
    
    System.out.println("");//blank line

    //loop to calculate the sum of the values entered
    for (int i = 0; i < baseNum.length; i++){
      sum = sum + baseNum[i];
    
    }
    
    System.out.print("The sum of the numbers you've entered is: " + sum);
  
      
      
    keyboard.close();
  }
}