package Examples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;


public class Simple extends Application {

    Rectangle r1 = new Rectangle(50,100,50,50);
    Rectangle r2 = new Rectangle(100,100,50,50);
    Rectangle r3 = new Rectangle(150,100,50,50);
    Rectangle r4 = new Rectangle(200,100,50,50);
    Rectangle r5 = new Rectangle(250,100,50,50);
    Rectangle r6 = new Rectangle(300,100,50,50);
    Rectangle r7 = new Rectangle(350,100,50,50);
    Rectangle r8 = new Rectangle(400,100,50,50);
    Rectangle r9 = new Rectangle(450,100,50,50);
    Rectangle r10 = new Rectangle(500,100,50,50);
    Rectangle r11 = new Rectangle(550,100,50,50);
    Rectangle r12 = new Rectangle(600,100,50,50);
    Rectangle r13 = new Rectangle(650,100,50,50);
    Rectangle r14 = new Rectangle(700,100,50,50);
    Rectangle r15 = new Rectangle(750,100,50,50);
    Rectangle r16 = new Rectangle(800,100,50,50);
    Rectangle r17 = new Rectangle(850,100,50,50);
    Rectangle r18 = new Rectangle(900,100,50,50);
    Rectangle r19 = new Rectangle(950,100,50,50);
    Rectangle r20 = new Rectangle(1000,100,50,50);
    Rectangle r21 = new Rectangle(1000,150,50,50);
    Rectangle r22 = new Rectangle(1000,200,50,50);
    Rectangle r23 = new Rectangle(1000,250,50,50);
    Rectangle r24 = new Rectangle(1000,300,50,50);
    Rectangle r25 = new Rectangle(1000,350,50,50);
    Rectangle r26 = new Rectangle(1000,400,50,50);
    Rectangle r27 = new Rectangle(1000,450,50,50);
    Rectangle r28 = new Rectangle(1000,500,50,50);
    Rectangle r29 = new Rectangle(1000,550,50,50);
    Rectangle r30 = new Rectangle(1000,600,50,50);
    Rectangle r31 = new Rectangle(1000,650,50,50);
    Rectangle r32 = new Rectangle(1000,700,50,50);
    Rectangle r33 = new Rectangle(1000,750,50,50);
    Rectangle r34 = new Rectangle(1000,800,50,50);
    Rectangle r35 = new Rectangle(1000,850,50,50);
    Rectangle r36 = new Rectangle(1000,900,50,50);
    Rectangle r37 = new Rectangle(1000,950,50,50);
    Rectangle r38 = new Rectangle(1000,1000,50,50);
    Rectangle r39 = new Rectangle(1000,1050,50,50);
    Rectangle r40 = new Rectangle(1000,1100,50,50);

    Circle circle = new Circle(75,125,15,Color.BLACK);
    int x = 0;
    int y = 0;
    int z = 0;

    Label label = new Label();


    public static void main(String[] args) {

        launch(args);
    }

    public void move(){

        Random random = new Random();
        int los = random.nextInt(6)+1;


        switch (los){
            case 1: y = 50;  break;
            case 2: y = 100; break;
            case 3: y = 150; break;
            case 4: y = 200; break;
            case 5: y = 250; break;
            case 6: y = 300; break;

            default: y =0;
        }

        if (circle.getCenterX() >= 1025){
            circle.setCenterY(125 + y + z);
            z += y;
        }

        else {
            circle.setCenterX(75 + x + y);
            x += y;
        }





        label.setText("Los : " + los + " " + y );
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


    Group root = new Group();
    Scene scene = new Scene(root,1100,1250, Color.AZURE);




    Button button = new Button();
    button.setText("Examples.EX");
    button.setOnAction(event -> move());
    button.setTranslateX(200);
    button.setTranslateY(250);

    r1.setFill(Color.RED);
    r2.setFill(Color.BLUE);
    r3.setFill(Color.YELLOW);
    r4.setFill(Color.GREEN);
    r5.setFill(Color.VIOLET);
    r6.setFill(Color.ORANGE);
    r7.setFill(Color.RED);
    r8.setFill(Color.BLUE);
    r9.setFill(Color.YELLOW);
    r10.setFill(Color.GREEN);
    r11.setFill(Color.VIOLET);
    r12.setFill(Color.ORANGE);
    r13.setFill(Color.RED);
    r14.setFill(Color.BLUE);
    r15.setFill(Color.YELLOW);
    r16.setFill(Color.GREEN);
    r17.setFill(Color.VIOLET);
    r18.setFill(Color.ORANGE);
    r19.setFill(Color.RED);
    r20.setFill(Color.BLUE);
    r21.setFill(Color.RED);
    r22.setFill(Color.BLUE);
    r23.setFill(Color.YELLOW);
    r24.setFill(Color.GREEN);
    r25.setFill(Color.VIOLET);
    r26.setFill(Color.ORANGE);
    r27.setFill(Color.RED);
    r28.setFill(Color.BLUE);
    r29.setFill(Color.YELLOW);
    r30.setFill(Color.GREEN);
    r31.setFill(Color.VIOLET);
    r32.setFill(Color.ORANGE);
    r33.setFill(Color.RED);
    r34.setFill(Color.BLUE);
    r35.setFill(Color.YELLOW);
    r36.setFill(Color.GREEN);
    r37.setFill(Color.VIOLET);
    r38.setFill(Color.ORANGE);
    r39.setFill(Color.RED);
    r40.setFill(Color.BLUE);
    //if(circle.getCenterX() == 250)



    label.setLayoutX(208);
    label.setLayoutY(280);




    root.getChildren().add(r1);
    root.getChildren().add(r2);
    root.getChildren().add(r3);
    root.getChildren().add(r4);
    root.getChildren().add(r5);
    root.getChildren().add(r6);
    root.getChildren().add(r7);
    root.getChildren().add(r8);
    root.getChildren().add(r9);
    root.getChildren().add(r10);
    root.getChildren().add(r11);
    root.getChildren().add(r12);
    root.getChildren().add(r13);
    root.getChildren().add(r14);
    root.getChildren().add(r15);
    root.getChildren().add(r16);
    root.getChildren().add(r17);
    root.getChildren().add(r18);
    root.getChildren().add(r19);
    root.getChildren().add(r20);
    root.getChildren().add(r21);
    root.getChildren().add(r22);
    root.getChildren().add(r23);
    root.getChildren().add(r24);
    root.getChildren().add(r25);
    root.getChildren().add(r26);
    root.getChildren().add(r27);
    root.getChildren().add(r28);
    root.getChildren().add(r29);
    root.getChildren().add(r30);
    root.getChildren().add(r31);
    root.getChildren().add(r32);
    root.getChildren().add(r33);
    root.getChildren().add(r34);
    root.getChildren().add(r35);
    root.getChildren().add(r36);
    root.getChildren().add(r37);



    root.getChildren().add(button);
    root.getChildren().add(circle);
    root.getChildren().add(label);

    primaryStage.setTitle("Examples.EX");
    primaryStage.setScene(scene);
    primaryStage.show();






    }
}
