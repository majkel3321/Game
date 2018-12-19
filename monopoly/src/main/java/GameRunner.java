import com.sun.javafx.sg.prism.GrowableDataBuffer;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;                      //?
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class GameRunner extends Application {

    private Image image = new Image("monopoly.jpg");
    private Image bill = new Image("100$.jpg",30,100,true,false);
    private FlowPane pawn = new FlowPane(Orientation.HORIZONTAL);
    private Label text = new Label();
    private Text field = new Text();
    private Text money = new Text();
    private Text price = new Text();
    private Text propertyList = new Text();
    Rectangle r = new Rectangle(250,300);
    Rectangle b = new Rectangle(270,320);
    GridPane grid = new GridPane();
    FieldDetection fieldDetection = new FieldDetection();
    Move move = new Move();
    int bank = 1500;
    ArrayList<Properties> playersProperties = new ArrayList<>();



    public static void main(String[] args) {

        launch(args);
    }

    public void buyHotel(){

        if (playersProperties.contains(fieldDetection.field(pawn))){
            price.setText("It's already\nyours!");

        }
        else {

            int value = fieldDetection.field(pawn).getValue();
            bank -= value;
            money.setText("Bank: " + bank + "$");
            playersProperties.add(fieldDetection.field(pawn));
        }

    }


    @Override
    public void start(Stage primaryStage) throws Exception {



        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);


        grid.setAlignment(Pos.TOP_LEFT);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);


        grid.getColumnConstraints().add(new ColumnConstraints(130));
        for(int i = 1; i <=9; i++){
            grid.getColumnConstraints().add(new ColumnConstraints(82));

        }
        grid.getColumnConstraints().add(new ColumnConstraints(130));
        grid.getRowConstraints().add(new RowConstraints(130));



        for(int i = 1; i <= 9; i++){
            grid.getRowConstraints().add(new RowConstraints(82));
        }
        grid.getRowConstraints().add(new RowConstraints(130));







        Button button1 = new Button();
        button1.setText("Move");
        button1.setOnAction((e) ->{move.move(text,field,price,money,propertyList,pawn,bank,playersProperties);
        });

        Button button2 = new Button();
        button2.setText("Buy");
        button2.setOnAction(event -> buyHotel());

        r.setFill(Color.AZURE);
        b.setFill(Color.BLUE);



        text.setTextFill(Color.RED);
        text.setFont(new Font(22));
        money.setFont(new Font("Arial",18));
        field.setFont(new Font("Arial",28));
        price.setUnderline(true);
        price.setFont(new Font(28));
        r.setTranslateX(52);
        r.setTranslateY(20);
        b.setTranslateX(42);
        b.setTranslateY(20);
        money.setTranslateX(55);
        money.setTranslateY(-29);
        propertyList.setFont(new Font("Arial",18));
        propertyList.setTranslateX(55);
        propertyList.setTranslateY(-5);




        ImageView img = new ImageView(bill);
        pawn.getChildren().add(img);



        grid.add(pawn, 0,0);
        grid.add(button1,4,8);
        grid.add(button2,5,8);
        grid.add(text,4,9);
        grid.add(field,2,2);
        grid.add(price,4,2);
        grid.add(b,6,7);
        grid.add(r,6,7);
        grid.add(money,6,6);
        grid.add(propertyList,6,6);








        pawn.setAlignment(Pos.CENTER);




        Scene scene = new Scene(grid, 1000, 1000, Color.AZURE);

        primaryStage.setTitle("Monopoly");
        primaryStage.setScene(scene);
        primaryStage.show();































        /*Group root = new Group();
        Scene scene = new Scene(root,1600,900, Color.BLACK);

        Rectangle r = new Rectangle(50,50,1500,800);
        //Rectangle s = new Rectangle(0,0,250,250);
        //Ellipse e = new Ellipse(800,450,500,100);

       // s.setFill(Color.RED);
        r.setFill(Color.RED);
       // e.setFill(Color.BLUE);
        root.getChildren().add(r);
       // root.getChildren().add(s);
        //root.getChildren().add(e);


        primaryStage.setTitle("Scene");
        primaryStage.setScene(scene);
        primaryStage.show();*/



    }
}