import java.util.Scanner;

/* 
Name: Tiffany Li
Date: July 23, 2022
Purpose: To create a program as a final project demonstrating about everything learned thus far in the course
*/

class Main {
  public static void main(String[] args) {
  
    Scanner keyboard = new Scanner(System.in);
   
    boolean gameEnd = false;//boolean for main loop
    printIntro();
    
    //while the gameEnd boolean is false, continue the game
    while (gameEnd == false) {
      //if the stage variable is over or equals 4, end the game
      if (stage >= 4) {
        gameEnd = true;
      }
      
      openMenu();//call method to print out the user menu
      String choice = keyboard.nextLine();//user input for user menu
      System.out.println("");//blank line
      int chosen = menuChoices(choice);//calls the menuChoices method and assigns the returned value to a variable 

      //if the user chooses fight
      if (chosen == 2) {
        summonMonster();//calls method to change the HP of the monsters depending on the stage

        
        boolean inBattle = true;
        System.out.println("A monster appeared! Prepare to fight!");
        fightStats();
        System.out.println("");//blank line
        
        //while in battle
        while (inBattle == true) {
          fightOptions();
          String move = keyboard.nextLine();//input to choose fighting choice
          System.out.println("");//blank line

          //check if player can use the ability
          if (fightChoice(move) == true){ //call the method to attack
            //check if the monster has died, if the monster died, end the battle and return back to the menu
            boolean monDead = checkMonHp();
            if (monDead == true) {
              inBattle = false;

              //if the stage is greater or equals 4, end the game
              if (stage >= 4) {
                gameEnd = true;
              }
            }

            else {
              monAttack();
              
            }
            
            boolean playerDead = checkHp();
            //otherwise if the player died, end the entire game and output message
            
            if (playerDead == true) {
              inBattle = false;
              gameEnd = true;
            }
          }
        }
      }
    } 
  
  
    keyboard.close();
  }//main class ends here
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //methods

  //variables and constants for methods
  //damage stats 
  static double dmg = 7; 
  static double holyBladeMult = 1.5;
  static double holyBladeDmg = dmg * holyBladeMult;
  static double hbCost = 45;
  static double fhCost = 35;

  //character stats
  static double hp = 50; 
  static final double maxHP = 50;
  static double mp = 70;
  static final double maxMP = 70;

  /*
  method: printIntro
  parameters: none
  return: void
  This method prints the introduction to the game when called
  */
  
  public static void printIntro() {
    System.out.println("");//blank line
    System.out.println("Welcome to Elysia: The First Quest");
    System.out.println("The world as we know is beginning to crumble under the reign of the evil demon king, Astorith.");
    System.out.println("According to the legends, 'In times of need, a hero blessed by the gods will ascend and vanquish the evil.'");
    System.out.println("You, are that very hero, young warrior, destined to free the world from the corruption of Astorith.");
    System.out.println("For your first quest, your are tasked with killing three monsters, but beware, the more progress you make, the more difficult your foes.");
    System.out.println("Now, pick up your weapons, steel your heart and prepare to begin your journey past the demon king's cruel army, good luck young hero.");

    System.out.println("");//blank line
    System.out.println("You will be given choices to choose from once you progress further in the game. Enter the number or letter that corresponds to the choice you would like to choose in order to continue.");
    System.out.println("");//blank line
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: openMenu
  parameters: none
  return: void
  This method outputs menu options for the user to choose from
  */ 
  public static void openMenu() {
    System.out.println("");//blank line
    System.out.println("User menu: ");
    System.out.println("To view your player status, enter 'e'.");
    System.out.println("To fight a monster, enter 'f'.");

  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: menuChoices
  parameters: one string
  return: int
  This method receives input from the user and returns numbers depending on what the user chooses
  */ 
  public static int menuChoices(String choice) {

    //if the user chooses to open the status
    if (choice.equals("e") || choice.equals("E")) {// choice.equalsIgnoreCase("e")
      checkStatus();//this method will also call the checkSkills method to display skills
      return 1;
    }

    //or if the user chooses to fight
    else if (choice.equals("f") || choice.equals("F")) {
      return 2;
    }

    //otherwise, output invalid input message 
    else {
      System.out.println("Invalid input, please try again.");
    }
    return 3;
  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: checkStatus
  parameters: none
  return: void
  */  
  public static void checkStatus() {
      System.out.println("STATUS BOARD");
      System.out.println("OCCUPATION || HERO");
      System.out.println("HP : " + hp);
      System.out.println("MP: " + mp);
      checkSkills();
  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: checkskills
  parameters: none
  return: void
  */
  public static void checkSkills() {
    System.out.println("");//blank line
    System.out.println("SKILLS");
    System.out.println("Basic Attack: Deal " + dmg + " damage to your foes");
    System.out.println("Holy Blade: Manifest the holy blessing of the gods and deal " + holyBladeMult + " times more damage to your enemies (costs " + hbCost + " MP)");
    System.out.println("Full Heal: Completely recover all of your missing HP (costs " + fhCost + " MP)");

      
  }

  //monster stats///////////////////////////////////////////////////////
  static double monHp;
  static double monMaxHp;
  static double monDmg;

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: summonMon
  parameters: none
  return: int
  Depending on the stage number, change the values of the monster stats
  */
  static final int monNumLength = 3;
  static int stage = 1;
  
  public static void summonMonster() {
    //array to store monster stats
    final int monStatsLength = 9;
    int[] monsterStats = new int [monStatsLength]; 
    
    //first monster stats
    monsterStats[0] = 5;//damage
    monsterStats[1] = 21;//HP
    monsterStats[2] = 21;//max HP

    //second monster stats
    monsterStats[3] = 10;//damage
    monsterStats[4] = 28;//HP
    monsterStats[5] = 28;//max HP

    //third monster stats
    monsterStats[6] = 15;//damage
    monsterStats[7] = 40;//HP
    monsterStats[8] = 40;//max HP

    //change the stats of the monster depending on the stage level
    //first monster
    if (stage == 1) {
      monDmg = monsterStats[0];
      monHp = monsterStats[1];
      monMaxHp = monsterStats[2];
      
    }

    //second monster
    else if (stage == 2) {
      monDmg = monsterStats[3];
      monHp = monsterStats[4];
      monMaxHp = monsterStats[5];
      
    }

    //third monster
    else if (stage == 3) {
      monDmg = monsterStats[6];
      monHp = monsterStats[7];
      monMaxHp = monsterStats[8];
      
    }

  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: fightStats
  parameters: none
  return: void
  */
  public static void fightStats() {
    System.out.println("Enemy HP: " + monHp + "/" + monMaxHp);
    System.out.println("Remaining HP: " + hp + "/" + maxHP);
    System.out.println("Remaining MP: " + mp + "/" + maxMP);

  
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: fightOptions
  parameters: none
  return: void
  Outputs choices for the the user to choose from during fight
  */
  public static void fightOptions() {
    System.out.println("Move list: ");
    System.out.println("Enter '1' to use Basic Attack");
    System.out.println("Enter '2' to use Holy Blade");
    System.out.println("Enter '3' to use Full Heal");
    System.out.println("");//blank line
  }
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: fightChoice
  parameters: one string
  return: boolean
  */
  public static boolean fightChoice(String choice) {
    //try converting the inputted value into an integer
    try {
      int num = Integer.parseInt(choice);
      //if the inputted value is 1, use first fight option
      if (num == 1) {
        System.out.println("You used your Basic Attack and dealt " + dmg + " damage!");
        System.out.println("");//blank line
        monHp = monHp - dmg;

        fightStats();//print out player and monster stats
      }

      //or if the inputted value is 2, use second fight option
      else if (num == 2) {
        //check if the player has enough MP to use this ability
        if (mp >= hbCost){
          System.out.println("You used your Holy Blade and dealt " + holyBladeDmg + " damage!");
          System.out.println("");//blank line
          
          monHp = monHp - holyBladeDmg;
          mp = mp - hbCost; 
        }

        //if the player doesn't have enough MP
        else {
          System.out.println("You don't have enough MP to use this ability, please try again.");
          System.out.println("");//blank line
          return false;
        }

        fightStats();//print out player and monster stats
      }

      //if the inputted value is 3, use third fight option
      else if (num == 3) {
        //check if the player has enough MP to use this ability
        if (mp >= fhCost){
          System.out.println("You used Full Heal! You recovered all missing HP and now have: " + maxHP + " HP.");
          System.out.println("");//blank line
          hp = maxHP;
          mp = mp - fhCost;
          
          fightStats();//print out player and monster stats
        }

        //if the player doesn't have enough MP
        else {
          System.out.println("You don't have enough MP to use this ability, please try again.");
          System.out.println("");//blank line
          return false;
        }
      }

      //otherwise, if the number is not any of the above, loop again
      else {
        System.out.println("Invalid input, please try again.");
        return false;
      }
    }

    //if the inputted value cannot be converted to an integer, catch the error and try again
    catch (NumberFormatException e) {
      System.out.println("Invalid input, please try again.");
      return false;
    }
    return true;
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: monAttack
  parameters: none
  return: void
  */
  public static void monAttack() {
    //everytime the monster attacks, take away HP and output message
    hp = hp - monDmg;
    System.out.println("");//blank line
    System.out.println("The monster attacked you and dealt " + monDmg + " damage!");
    System.out.println("");//blank line
    fightStats();
    System.out.println("");//blank line
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: checkHp
  parameters: none
  return: boolean
  */
  public static boolean checkHp() {
    //check if the player has died
    if (hp <= 0){
      System.out.println("You ran out of HP, Game Over. ");
      return true;
    }

    //otherwise continue the program
    else {
      return false;
    }
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
  method: checkMonHp
  parameters: none
  return: boolean
  */
  public static boolean checkMonHp() {
    //check if the first two monsters have been defeated, output message
    if (monHp <= 0) {
      if (stage <= 2) {
        System.out.println("");//blank line
        System.out.println("You've defeated the monster! You now have a brief moment of peace where you can view your status. You will also regenerate all missing HP and MP before your next fight.");
      }

      //check if the last monster has been defeated, output a different message
      else if (stage == 3) {
        System.out.println("");//blank line
        System.out.println("You've defeated the last monster! Congratulations, you've completed Elysia: The First Quest! Thank you for playing.");
      }
      //everytime a monster is defeated, recover all HP and MP
      hp = maxHP;
      mp = maxMP;

      stage++;//go to next stage/monster
      return true;
    }

    //otherwise continue the program until the monster has been defeated
    else {
      return false;
    }
  }
 
}

