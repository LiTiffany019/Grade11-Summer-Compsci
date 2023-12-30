import java.util.Scanner;
/*
  Name: Tiffany Li
  Date: July 18, 2022
  Purpose of Program: To create a program that provides the caller 10 different mathematical calculations to choose from. It will allow the caller to input values, loop back to the menu, and exit the program depending on their input.
*/


class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //input variable
    int choice;
    
    //loops the menu and calls methods depending on boolean values
    do {
    
      printMenu();
      choice = keyboard.nextInt();//receive input
      
      
      /////////////////////////////////////////////////////////////////////////////////////////////
      //first option -- adding 
      
      if (choice == 1) {
        //instructions
        System.out.println("Enter two integers to add together:");
        
        //receive two ints
        System.out.print("1: ");
        int num1 = keyboard.nextInt();
        System.out.print("2: ");
        int num2 = keyboard.nextInt();

        //call add method
        int sum = add(num1, num2);
        System.out.println("The sum of " + num1 + " + " + num2 + " is: " + sum);
        
        }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //second option -- max value
      
      else if (choice == 2) {
        //intructions
        System.out.println("Please enter three integers");
        
        //receive three ints
        System.out.print("1: ");
        int num1 = keyboard.nextInt();
        System.out.print("2: ");
        int num2 = keyboard.nextInt();
        System.out.print("3: ");
        int num3 = keyboard.nextInt();

        //call max method
        int max = max3(num1, num2, num3);
        System.out.println("The max of " + num1 + ", " + num2 + ", and " + num3 +  " is: " + max); 
      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //third option -- min value
      
      else if (choice == 3) {
        //intructions
        System.out.println("Please enter three numbers");
        
        //receive three ints
        System.out.print("1: ");
        int num1 = keyboard.nextInt();
        System.out.print("2: ");
        int num2 = keyboard.nextInt();
        System.out.print("3: ");
        int num3 = keyboard.nextInt();

        //call min method
        int min = min3(num1, num2, num3);
        System.out.println("The min of " + num1 + ", " + num2 + ", and " + num3 +  " is: " + min); 
      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //fourth option -- average value
      
      else if (choice == 4) {
        //intructions
        System.out.println("Please enter three integers");
        
        //receive three doubles
        System.out.print("1: ");
        double num1 = keyboard.nextInt();
        System.out.print("2: ");
        double num2 = keyboard.nextInt();
        System.out.print("3: ");
        double num3 = keyboard.nextInt();

        //call avg method
        double average = avg(num1, num2, num3);
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 +  " is: " +  average); 

      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //fifth option -- quotient 
      
      else if (choice == 5) {
        //intructions
        System.out.println("Please enter two integers");
        
        //receive two integers
        System.out.print("1: ");
        int num1 = keyboard.nextInt();
        System.out.print("2: ");
        int num2 = keyboard.nextInt();
        
        //call mult method
        int quotient = mult(num1, num2);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient); 

      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //sixth option -- cube
      
      else if (choice == 6) {
        //intructions
        System.out.println("Please enter a number");
        
        //receive a double
        System.out.print("1: ");
        double num1 = keyboard.nextInt();
        
        
        //call cube method
        double power = cube(num1);
        System.out.println(num1 + " cubed is: " + power); 

      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //seventh option -- rounded radian
      
      else if (choice == 7) {
        //intructions
        System.out.println("Please enter a number");
        
        //receive a double
        System.out.print("1: ");
        double num1 = keyboard.nextInt();
        
        
        //call radian method
        double rad = radian(num1);
        System.out.println("The radian rounded to the nearest integer is: " + rad); 

      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //eigth option -- plus 2
      
      else if (choice == 8) {
        //intructions
        System.out.println("Please enter a number");
        
        //receive a double
        System.out.print("1: ");
        double num1 = keyboard.nextInt();
        
        
        //call plus2 method
        double sum = plus2(num1);
        System.out.println(num1 + " plus 2 is : " + sum); 

      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //ninth option -- minus 2
      
      else if (choice == 9) {
        //intructions
        System.out.println("Please enter a number");
        
        //receive a double
        System.out.print("1: ");
        double num1 = keyboard.nextInt();
        
        
        //call minus2 method
        double ans = minus2(num1);
        System.out.println(num1 + " minus 2 is : " + ans); 

      }

      /////////////////////////////////////////////////////////////////////////////////////////////
      //tenth option -- rounds the square root of the double to the nearest integer
      
      else if (choice == 10) {
        //intructions
        System.out.println("Please enter a number");
        
        //receive an double
        System.out.print("1: ");
        double num1 = keyboard.nextInt();
        
        
        //call sqrtRound method
        double ans = sqrtRound(num1);
        System.out.println("The square root of " + num1 + ", rounded to the nearest integer is : " + ans); 

      }
      
      } while (choice < 11);//end of loop

      //exit program
      if (choice == 11){
        exit();
      }

      keyboard.close();
    }//main class ends here

    /////////////////////////////////////////////////////////////////////////////////////////////
    
    /////////////////////////////////////////////////////////////////////////////////////////////
    //Methods
  
    /* 
      Method: printMenu
      Parameters: none
      Return: void
      This method prints out the menu for the caller to call from
    */
    public static void printMenu() {
      System.out.println("-----------------------------------------");
      System.out.println("");//blank line
      System.out.println("Welcome to the Math Calculator!");
      System.out.println("Please enter a number corresponding to the option you would like to execute.");
      System.out.println("");//blank line
      
      //menu options
      System.out.println("1. Add two intergers together.");
      System.out.println("2. Find the max of three integers.");
      System.out.println("3. Find the min of three integers.");
      System.out.println("4. Find the average of the three integers.");
      System.out.println("5. Multiply two integers together.");
      System.out.println("6. Cube any number.");
      System.out.println("7. Calculate the radian of a value rounded to the nearest integer.");
      System.out.println("8. Enter any integer and add two.");
      System.out.println("9. Enter any integer and subtract 2.");
      System.out.println("10. Find the square root of any number.");
      System.out.println("11. Exit the program.");
    }
  
    /*
      Method: add
      Parameters: two ints
      Return: int: the sum of the two ints
    */
    public static int add(int n1, int n2) {
      int sum = n1 + n2;
      return sum;
    
  }

    /*
      Method: max3
      Parameters: three ints
      Return: int - that max value of those three ints using the max method
    */
    public static int max3(int n1, int n2, int n3) {
      int tempMax = Math.max(n1, n2);
      return Math.max(tempMax, n3);
    }

    /*
      Method: min3
      Parameters: three doubles
      Return: int - that min value of those three ints using the min method
    */
    public static int min3(int n1, int n2, int n3) {
      int tempMax = Math.min(n1, n2);
      return Math.min(tempMax, n3);
    }

    /*
      Method: avg
      Parameters: three doubles
      Return: double - the average value of the three doubles
    */
    public static double avg(double n1, double n2, double n3) {
      double average = (n1 + n2 + n3) / 3;
      return average;
    }

    /*
      Method: mult
      Parameters: two ints
      Return: int - the quotient of the two ints
    */
    public static int mult(int n1, int n2) {
      int quotient= n1 * n2;
      return quotient;
    }

    /*
      Method: cube
      Parameters: one double
      Return: double - cube the inputted double using the pow method
    */
    public static double cube(double n1) {
      double raise = Math.pow(n1, 3);
      return raise;
    }

    /*
      Method: radian
      Parameters: one double
      Return: double - the radian rounded using the round method
    */
    public static double radian(double n1) {
      double tempRad = Math.toRadians(n1);
      return Math.round(tempRad);
    }

    /*
      Method: plus2
      Parameters: one int
      Return: int - adds two to any integer
    */
    public static double plus2(double n1) {
      return n1 + 2;
    }

    /*
      Method: minus2
      Parameters: one int
      Return: int - subtracts two from any integer
    */
    public static double minus2(double n1) {
      return n1 - 2;
    }

    /*
      Method: sqrtRound
      Parameters: one int
      Return: double - rounds the square root of a double
    */
    public static double sqrtRound(double n1) {
      double ans = Math.sqrt(n1);
      return Math.round(ans);
      
    }

  
    /*
      Method: exit
      Parameters: none
      Return: void
      This method will not be looped. Outputs farewell message
    */
    public static void exit() {
      System.out.println("Thank you for using the Math Calculator program, goodbye.");
      
    }
  
}