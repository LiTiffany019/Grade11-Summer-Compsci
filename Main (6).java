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

/*
  Name: Tiffany Li
  Date: July 17, 2022
  Purpose of the Program: To demonstrate the use of math methods in a GUI
*/
public class Main extends Application 
{ 
  
  @Override
  public void start(Stage primaryStage) {

    final int TFW = 50;
    // You will need eight labels
    // YOu still need to assign all the values
    Label[] label = new Label[8]; 

    // Answer labels (You will need 8)
    Label[] ansLabel = new Label[8];
    
    
    // You will need 12 text fields
    TextField [] tf = new TextField[12];
    
    // You will need eight buttons
    Button[] button = new Button[8];
    
    // You will need eight hbox
    HBox[] hbox = new HBox[8];

    // VBox for each operation
    VBox[] mathVbox = new VBox[8];
    
    VBox vbox;
    Scene scene;

    //////////////  Title //////////////
    Label titleLabel = new Label("MAGICAL MATH METHODS");

    
/////////////////////////////////////////////////////////////////////////

    // First Row (Largest Operation)
    // Each button has its own setOnAction method

    //largest text fields
    tf[0] = new TextField();
    tf[0].setMaxWidth(TFW);
    tf[1] = new TextField();
    tf[1].setMaxWidth(TFW);

    //largest labels
    label[0] = new Label("Enter two numbers and click the button. The program will display the largest of the two numbers.");
    label[0].setWrapText(true);
    //label[0].setMaxWidth(500);
    button[0] = new Button("Largest"); 
    ansLabel[0] = new Label("...");

    // Largest button
    button[0].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        int num1 = Integer.parseInt(tf[0].getText());
        int num2 = Integer.parseInt(tf[1].getText());
        ansLabel[0].setText("" + Math.max(num1,num2));
      }
    });

    // largest hbox
    hbox[0] = new HBox(80, tf[0], tf[1], button[0], ansLabel[0]);
    hbox[0].setAlignment(Pos.CENTER);

    //largest vbox
    mathVbox[0] = new VBox(label[0], hbox[0]);
    
    /////////////////////////////////////////////////////////////////////////

    // Second Row (Smallest Operation)
    // Each button has its own setOnAction method

    //smallest text fields
    tf[2] = new TextField();
    tf[2].setMaxWidth(TFW);
    tf[3] = new TextField();
    tf[3].setMaxWidth(TFW);

    //smallest labels
    label[1] = new Label("Enter two numbers and click the button. The program will display the smallest of the two numbers.");
    label[1].setWrapText(true);
    button[1] = new Button("Smallest"); 
    ansLabel[1] = new Label("...");

    // smallest button
    button[1].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        int num3 = Integer.parseInt(tf[2].getText());
        int num4 = Integer.parseInt(tf[3].getText());
        ansLabel[1].setText("" + Math.min(num3,num4));
      }
    });

    // smallest hbox
    hbox[1] = new HBox(80, tf[2], tf[3], button[1], ansLabel[1]);
    hbox[1].setAlignment(Pos.CENTER);

    //smallest vbox
    mathVbox[1] = new VBox(label[1], hbox[1]);


    /////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////

    // Third Row (To the Power Of ... Operation)
    // Each button has its own setOnAction method

    //power text fields
    tf[4] = new TextField();
    tf[4].setMaxWidth(TFW);
    tf[5] = new TextField();
    tf[5].setMaxWidth(TFW);

    //power labels
    label[2] = new Label("Enter two numbers and click the button. The program will display the first number to the power of the second.");
    label[2].setWrapText(true);
    button[2] = new Button("Power"); 
    ansLabel[2] = new Label("...");

    // power button
    button[2].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        int num5 = Integer.parseInt(tf[4].getText());
        int num6 = Integer.parseInt(tf[5].getText());
        ansLabel[2].setText("" + Math.pow(num5,num6));
      }
    });

    // power hbox
    hbox[2] = new HBox(80, tf[4], tf[5], button[2], ansLabel[2]);
    hbox[2].setAlignment(Pos.CENTER);

    //power vbox
    mathVbox[2] = new VBox(label[2], hbox[2]);

    /////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////

    // Fourth Row (Hypotenuse Operation)
    // Each button has its own setOnAction method

    //hypotenuse text fields
    tf[6] = new TextField();
    tf[6].setMaxWidth(TFW);
    tf[7] = new TextField();
    tf[7].setMaxWidth(TFW);

    //hypotenuse text fields
    label[3] = new Label("Enter two numbers and click the button. The program will display the hypotenuse of the triangle.");
    label[3].setWrapText(true);
    button[3] = new Button("Hypotenuse"); 
    ansLabel[3] = new Label("...");

    // hypotenuse button
    button[3].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        int num7 = Integer.parseInt(tf[6].getText());
        int num8 = Integer.parseInt(tf[7].getText());
        ansLabel[3].setText("" + Math.hypot(num7,num8));
      }
    });

    // hypotenuse hbox
    hbox[3] = new HBox(80, tf[6], tf[7], button[3], ansLabel[3]);
    hbox[3].setAlignment(Pos.CENTER);

    //hypotenuse vbox
    mathVbox[3] = new VBox(label[3], hbox[3]);

    /////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////

    // Fifth Row (Round Down Operation)
    // Each button has its own setOnAction method

    //round down text fields
    tf[8] = new TextField();
    tf[8].setMaxWidth(TFW);
    
    //round down labels
    label[4] = new Label("Enter a decimal value. The program will display value rounded down to the nearest interger");
    label[4].setWrapText(true);
    button[4] = new Button("Round Down"); 
    ansLabel[4] = new Label("...");

    // round down button
    button[4].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        double num9 = Double.parseDouble(tf[8].getText());
        ansLabel[4].setText("" + Math.floor(num9));
      }
    });

    // round down hbox
    hbox[4] = new HBox(80, tf[8], button[4], ansLabel[4]);
    hbox[4].setAlignment(Pos.CENTER);

    //round down vbox
    mathVbox[4] = new VBox(label[4], hbox[4]);

    /////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////

    // Sixth Row (Round UP Operation)
    // Each button has its own setOnAction method

    //round up text field
    tf[9] = new TextField();
    tf[9].setMaxWidth(TFW);
    
    //round up labels
    label[5] = new Label("Enter a decimal value. The program will display value rounded up to the nearest interger");
    label[5].setWrapText(true);
    button[5] = new Button("Round Up"); 
    ansLabel[5] = new Label("...");

    // round up button
    button[5].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        double num10 = Double.parseDouble(tf[9].getText());
        ansLabel[5].setText("" + Math.ceil(num10));
      }
    });

    //round up hbox
    hbox[5] = new HBox(80, tf[9], button[5], ansLabel[5]);
    hbox[5].setAlignment(Pos.CENTER);

    //round up vbox
    mathVbox[5] = new VBox(label[5], hbox[5]);

    /////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////

    // Seventh Row (Square Root Operation)
    // Each button has its own setOnAction method

    //square root text field
    tf[10] = new TextField();
    tf[10].setMaxWidth(TFW);
    
    //square root labels
    label[6] = new Label("Enter an integer. The program will display the square root of the interger");
    label[6].setWrapText(true);
    button[6] = new Button("Square Root"); 
    ansLabel[6] = new Label("...");

    // square root button
    button[6].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        int num11 = Integer.parseInt(tf[10].getText());
        ansLabel[6].setText("" + Math.sqrt(num11));
      }
    });

    // square root hbox
    hbox[6] = new HBox(80, tf[10], button[6], ansLabel[6]);
    hbox[6].setAlignment(Pos.CENTER);

    //square root vbox
    mathVbox[6] = new VBox(label[6], hbox[6]);

    /////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////

    // Eighth Row (Radians Operation)
    // Each button has its own setOnAction method

    //radians text field
    tf[11] = new TextField();
    tf[11].setMaxWidth(TFW);
    
    //radians labels
    label[7] = new Label("Enter an angle in degrees. The program will display angle in radians");
    label[7].setWrapText(true);
    button[7] = new Button("In Radians"); 
    ansLabel[7] = new Label("...");

    // radians button
    button[7].setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        double num12 = Double.parseDouble(tf[11].getText());
        ansLabel[7].setText("" + Math.toRadians(num12));
      }
    });

    // radians hbox
    hbox[7] = new HBox(80, tf[11], button[7], ansLabel[7]);
    hbox[7].setAlignment(Pos.CENTER);

    //radians vbox
    mathVbox[7] = new VBox(label[7], hbox[7]);

    /////////////////////////////////////////////////////////////////////////

    
    // Putting it all together
    vbox = new VBox(titleLabel, mathVbox[0], mathVbox[1], mathVbox[2], mathVbox[3], mathVbox[4], mathVbox[5], mathVbox[6], mathVbox[7]);
    vbox.setSpacing(20);
    vbox.setAlignment(Pos.TOP_LEFT);
    VBox.setMargin(titleLabel, new Insets(0, 0, 0, 220));
    scene = new Scene(vbox, 700, 800);
    
    primaryStage.setTitle("Magical Math Methods");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 
