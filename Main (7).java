package replit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;   
import javafx.scene.paint.Color;


/*
  Name: Tiffany Li
  Date: July 17, 2022
  Purpose of the Program: To demonstrate the use of string methods in a GUI
*/

public class Main extends Application 
{ 
  
  @Override
  public void start(Stage primaryStage) {

    final int TFW = 150;
    final int SMALLER = 50;
    // You will need eight labels (includes title)
    // YOu still need to assign all the values
    Label[] label = new Label[7]; 
    Label titleLable;

    // Answer labels (You will need 8)
    Label[] ansLabel = new Label[7];
    
    
    // You will need 12 text fields
    TextField [] tf = new TextField[9];
    
    // You will need eight buttons
    Button[] button = new Button[7];
    
    // You will need eight hbox
    HBox[] hbox = new HBox[7];

    // VBox for each section (command)
    VBox[] stringVbox = new VBox[7];
    
    VBox vbox;
    Scene scene;

         // Title
    titleLable = new Label("SUPER STRING SOFTWARE");
    HBox title = new HBox(titleLable);
    title.setAlignment(Pos.TOP_CENTER);

    /////////////////////////////////////////////////////////////////////////
    // First Row (LENGTH operation)

    //length text field
    tf[0] = new TextField();
    tf[0].setMaxWidth(TFW);

    //length labels
    label[0] = new Label("Enter a String. The Program will output the number of characters in the String.");
    label[0].setWrapText(true);
    button[0] = new Button("Length"); 
    ansLabel[0] = new Label("...");

    // Length button
    button[0].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word1 = tf[0].getText();
        int stringLength = (word1.length());
        ansLabel[0].setText("" + stringLength);
      }
    });

    // length hbox
    hbox[0] = new HBox(80, tf[0], button[0], ansLabel[0]);
    hbox[0].setAlignment(Pos.CENTER_LEFT);

    //length vbox
    stringVbox[0] = new VBox(label[0], hbox[0]);
   
    /////////////////////////////////////////////////////////////////////////

    // Second Row (ALL CAPS Operation)
    // Each button has its own setOnAction method

    //upper text field
    tf[1] = new TextField();
    tf[1].setMaxWidth(TFW);

    //upper labels
    label[1] = new Label("Enter a String. The Program will output the string in all capital letters.");
    label[1].setWrapText(true);
    button[1] = new Button("All Caps"); 
    ansLabel[1] = new Label("...");

    // upper button
    button[1].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word2 = tf[1].getText();
        String stringUpper = (word2.toUpperCase());
        ansLabel[1].setText("" + stringUpper);
      }
    });

    // upper hbox
    hbox[1] = new HBox(80, tf[1], button[1], ansLabel[1]);
    hbox[1].setAlignment(Pos.CENTER_LEFT);

    //upper vbox
    stringVbox[1] = new VBox(label[1], hbox[1]);

    /////////////////////////////////////////////////////////////////////////

    // Third Row (4th Spot Operation)
    // Each button has its own setOnAction method

    //4th spot text field
    tf[2] = new TextField();
    tf[2].setMaxWidth(TFW);

    //4th spot labels
    label[2] = new Label("Enter a String. The Program will output the character in the 4th spot.");
    label[2].setWrapText(true);
    button[2] = new Button("4th spot"); 
    ansLabel[2] = new Label("...");

    //4th spot button
    button[2].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word3 = tf[2].getText();
        char stringCharAt = (word3.charAt(3));
        ansLabel[2].setText("" + stringCharAt);
      }
    });

    //4th spot hbox
    hbox[2] = new HBox(80, tf[2], button[2], ansLabel[2]);
    hbox[2].setAlignment(Pos.CENTER_LEFT);

    //4th spot vbox
    stringVbox[2] = new VBox(label[2], hbox[2]);

    /////////////////////////////////////////////////////////////////////////

     /////////////////////////////////////////////////////////////////////////

    // Four Row (Identical? Operation)
    // Each button has its own setOnAction method

    //identical text field
    tf[3] = new TextField();
    tf[3].setMaxWidth(TFW);
    tf[4] = new TextField();
    tf[4].setMaxWidth(TFW);

    //identical labels
    label[3] = new Label("Enter a String. The Program will output whether or not they are identical.");
    label[3].setWrapText(true);
    button[3] = new Button("Identical?"); 
    ansLabel[3] = new Label("...");

    //identical button
    button[3].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word4 = tf[3].getText();
        String word5 = tf[4].getText();

        //check if they are equal
        if (word4.equals(word5)) {
          ansLabel[3].setText(word4 + " and "  + word5 + " are identical");   
        }

        else {
          ansLabel[3].setText(word4 + " and " + word5 + " are not identical");
        }
      }
    });

    //identical hbox
    hbox[3] = new HBox(80, tf[3], tf[4], button[3], ansLabel[3]);
    hbox[3].setAlignment(Pos.CENTER_LEFT);

    //identical vbox
    stringVbox[3] = new VBox(label[3], hbox[3]);

    /////////////////////////////////////////////////////////////////////////

     /////////////////////////////////////////////////////////////////////////

    // Fifth Row (Letter Found? Operation)
    // Each button has its own setOnAction method

    //letter found text field
    tf[5] = new TextField();
    tf[5].setMaxWidth(TFW);
    tf[6] = new TextField();
    tf[6].setMaxWidth(SMALLER);
    
    //letter found labels
    label[4] = new Label("Enter a String and a letter. The Program will output whether or not the letter is found in the string.");
    label[4].setWrapText(true);
    button[4] = new Button("Letter Found?"); 
    ansLabel[4] = new Label("...");

    //letter found button
    button[4].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word6 = tf[5].getText();
        String word7 = tf[6].getText();

        //check if the string contains the letter
        if (word6.contains(word7)) {
          ansLabel[4].setText("The string contains the letter");
          ansLabel[4].setWrapText(true); 
        }

        else {
          ansLabel[4].setText("The string does not contains the letter");
          ansLabel[4].setWrapText(true); 
        }
      }
    });

    //letter found hbox
    hbox[4] = new HBox(80, tf[5], tf[6], button[4], ansLabel[4]);
    hbox[4].setAlignment(Pos.CENTER_LEFT);

    //letter found vbox
    stringVbox[4] = new VBox(label[4], hbox[4]);

    /////////////////////////////////////////////////////////////////////////

     /////////////////////////////////////////////////////////////////////////

    // Six Row (Characters 4 to 6 Operation)
    // Each button has its own setOnAction method

    //4-6 text field
    tf[7] = new TextField();
    tf[7].setMaxWidth(TFW);

    //4-6 labels
    label[5] = new Label("Enter a String. The Program will output characters 4-6");
    label[5].setWrapText(true);
    button[5] = new Button("Characters 4 to 6"); 
    ansLabel[5] = new Label("...");

    //4-6 button
    button[5].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word8 = tf[7].getText();
        char stringCharAt2 = (word8.charAt(3));
        char stringCharAt3 = (word8.charAt(4));
        char stringCharAt4 = (word8.charAt(5));
        ansLabel[5].setText("Characters 4 to 6 are: " + stringCharAt2 + stringCharAt3 + stringCharAt4);
      }
    });

    //4-6 hbox
    hbox[5] = new HBox(80, tf[7], button[5], ansLabel[5]);
    hbox[5].setAlignment(Pos.CENTER_LEFT);

    //4-6 vbox
    stringVbox[5] = new VBox(label[5], hbox[5]);

    /////////////////////////////////////////////////////////////////////////

     /////////////////////////////////////////////////////////////////////////

    // Seventh Row (Replace all A's Operation)
    // Each button has its own setOnAction method

    //replace text field
    tf[8] = new TextField();
    tf[8].setMaxWidth(TFW);

    //replace labels
    label[6] = new Label("Enter a String that contains at least one 'a'. The program will then replace all occurences of the letter 'a' with 'y'.");
    label[6].setWrapText(true);
    button[6] = new Button("Replaces 'a'"); 
    ansLabel[6] = new Label("...");

    //replace button
    button[6].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        String word9 = tf[8].getText();
        String stringReplace = (word9.replace("a", "y"));
        ansLabel[6].setText("" + stringReplace);
      }
    });

    //replace hbox
    hbox[6] = new HBox(80, tf[8], button[6], ansLabel[6]);
    hbox[6].setAlignment(Pos.CENTER_LEFT);

    //replace vbox
    stringVbox[6] = new VBox(label[6], hbox[6]);

    /////////////////////////////////////////////////////////////////////////

    // Putting it all together
    vbox = new VBox(title, stringVbox[0], stringVbox[1], stringVbox[2], stringVbox[3], stringVbox[4], stringVbox[5], stringVbox[6]);
    vbox.setSpacing(20);
    vbox.setAlignment(Pos.BASELINE_LEFT);
    // Attempt to centre the title at the top of the window
    VBox.setMargin(title, new Insets(0,0,0,100));
    scene = new Scene(vbox, 900, 500, Color.BLUE);
    
    primaryStage.setTitle("Fun With Strings!");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 
