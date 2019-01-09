
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
    private Image bill = new Image("100$.jpg",55,100,true,false);
    private Image oponentBill = new Image("Red dollar.jpg",55,100,true,false);
    private FlowPane pawn = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pawn2 = new FlowPane(Orientation.HORIZONTAL);
    private Label text = new Label();
    private Text field = new Text();
    private Text money = new Text();
    private Text price = new Text();
    private Label propertyList = new Label();
    private Text turn = new Text();
    Rectangle r = new Rectangle(270,300);
    Rectangle b = new Rectangle(290,320);
    GridPane grid = new GridPane();
    FlowPane flowPane = new FlowPane();
    BorderPane borderPane = new BorderPane();
    FieldDetection fieldDetection = new FieldDetection();
    Move move = new Move();
    BuyHotel buyHotel = new BuyHotel();
    int bank = 1500;
    ArrayList<Properties> playersProperties = new ArrayList<>();



    public static void main(String[] args) {

        launch(args);
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



        money.setText("Bank: " + bank + "$");


        Button button1 = new Button();
        button1.setText("Move");
        button1.setOnAction((e) ->{move.move(text,field,price,pawn,turn,pawn2);
        });

        Button button2 = new Button();
        button2.setText("Buy");
        button2.setOnAction(event -> buyHotel.buyHotel(playersProperties,propertyList,price,pawn,money));

        r.setFill(Color.AZURE);
        b.setFill(Color.BLUE);



        text.setTextFill(Color.RED);
        text.setFont(new Font(22));
        money.setFont(new Font("Arial",18));
        field.setFont(new Font("Arial",28));
        price.setUnderline(true);
        price.setFont(new Font(28));
        price.setTranslateX(100);
        r.setTranslateX(72);
        r.setTranslateY(20);
        b.setTranslateX(62);
        b.setTranslateY(20);
        money.setTranslateX(75);
        money.setTranslateY(-29);
        propertyList.setFont(new Font("Arial",18));
        propertyList.setTranslateX(75);
        propertyList.setTranslateY(-5);
        pawn.setAlignment(Pos.CENTER);
        pawn.setTranslateY(-5);
        pawn2.setAlignment(Pos.CENTER);
        pawn2.setTranslateY(15);
        propertyList.setWrapText(true);
        propertyList.setMaxHeight(300);
        propertyList.setMinHeight(300);
        propertyList.setMinWidth(250);
        turn.setText("Your turn!");
        turn.setFont(new Font("Arial",26));







        ImageView img = new ImageView(bill);
        ImageView img2 = new ImageView(oponentBill);
        pawn.getChildren().add(img);
        pawn2.getChildren().add(img2);



        grid.add(pawn, 0,0);
        grid.add(pawn2, 0,0);
        grid.add(button1,4,8);
        grid.add(button2,5,8);
        grid.add(text,4,9);
        grid.add(field,2,2);
        grid.add(price,4,2);
        grid.add(b,12,8);
        grid.add(r,12,8);
        grid.add(money,12,7);
        grid.add(propertyList,12,8);
        grid.add(turn,4,1);

        //flowPane.setStyle("-fx-background-color: red");
        //flowPane.getChildren().add(propertyList);
        //grid.add(flowPane,6,7,3,3);





        Scene scene = new Scene(grid, 1500, 1000, Color.AZURE);

        primaryStage.setTitle("Monopoly");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}